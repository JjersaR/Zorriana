CREATE FUNCTION dbo.SplitIntArrayToTable (@IntArray VARCHAR(MAX))
RETURNS @IntTable TABLE (IntValue INT)
AS
BEGIN
    DECLARE @pos INT;
    SET @IntArray = REPLACE(REPLACE(@IntArray, '[', ''), ']', ''); -- Eliminar corchetes
    WHILE CHARINDEX(',', @IntArray) > 0
    BEGIN
        SET @pos = CHARINDEX(',', @IntArray);
        INSERT INTO @IntTable (IntValue) VALUES (CAST(SUBSTRING(@IntArray, 1, @pos-1) AS INT));
        SET @IntArray = STUFF(@IntArray, 1, @pos, '');
    END
    INSERT INTO @IntTable (IntValue) VALUES (CAST(@IntArray AS INT));
    RETURN;
END;

go;

CREATE PROCEDURE pa_InsertarArticulo
    @Nombre varchar(50),
    @Descripcion varchar(500),
    @Disponible bit,
    @Precio decimal(10,2),
    @Link_Imagen varchar(500),
    @CategoriasArray VARCHAR(MAX) -- Arreglo de categorías separadas por comas: '[1,2,3,4]'
AS
BEGIN
    SET NOCOUNT ON;

    BEGIN TRY
        BEGIN TRANSACTION; -- Iniciar transacción

        -- Insertar el artículo en la tabla Articulos
        INSERT INTO Articulos (Nombre, Descripcion, Disponible, Precio, Num_Veces_Vendido, Link_Imagen)
        VALUES (@Nombre, @Descripcion, @Disponible, @Precio, 0, @Link_Imagen);

        -- Obtener el ID del artículo recién insertado
        DECLARE @Articulo_ID int;
        SET @Articulo_ID = SCOPE_IDENTITY();

        -- Insertar relaciones en la tabla Categorias_X_Articulos
        INSERT INTO Categorias_X_Articulos (Categoria_ID, Articulo_ID)
        SELECT IntValue, @Articulo_ID
        FROM dbo.SplitIntArrayToTable(@CategoriasArray);

        COMMIT TRANSACTION; -- Confirmar transacción
    END TRY
    BEGIN CATCH
        

        -- Manejar el error (puedes personalizar cómo deseas manejar el error aquí)
		DECLARE @msgError VARCHAR(MAX);
        SET @msgError = ERROR_MESSAGE();
        RAISERROR(@msgError, 16, 1);
        ROLLBACK TRANSACTION; -- Hacer rollback si hay una transacción activa
    END CATCH;
END;

EXEC InsertarArticuloConCategoriasArreglo 
    @Nombre = 'Dildo Rosa',
    @Descripcion = 'Descripción del Artículo',
    @Disponible = 1,
    @Precio = 219.99,
    @Link_Imagen = 'https://placehold.co/600x400',
    @CategoriasArray = '[1,2,3]';