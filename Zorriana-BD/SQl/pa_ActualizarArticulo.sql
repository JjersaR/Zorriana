CREATE PROCEDURE pa_ActualizarArticulo
    @ID INT,
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

        -- Verificar si el artículo existe
        IF EXISTS (SELECT 1 FROM Articulos WHERE Articulo_ID = @ID)
        BEGIN
            -- Actualizar el artículo en la tabla Articulos
            UPDATE Articulos
            SET Nombre = @Nombre,
                Descripcion = @Descripcion,
                Disponible = @Disponible,
                Precio = @Precio,
                Link_Imagen = @Link_Imagen
            WHERE Articulo_ID = @ID;

            -- Borramos todas las relaciones de categorías para el artículo
            DELETE FROM Categorias_X_Articulos WHERE Articulo_ID = @ID;

            -- Insertar relaciones en la tabla Categorias_X_Articulos
            INSERT INTO Categorias_X_Articulos (Categoria_ID, Articulo_ID)
            SELECT IntValue, @ID
            FROM dbo.SplitIntArrayToTable(@CategoriasArray);

            COMMIT TRANSACTION; -- Confirmar transacción

            -- Retornar un mensaje al cliente
            SELECT 'Producto Actualizado Exitosamente' AS Message;
        END
        ELSE
        BEGIN
            -- El producto no existe, cancelar la transacción y enviar un mensaje
            ROLLBACK TRANSACTION; -- Hacer rollback si hay una transacción activa
        END
    END TRY
    BEGIN CATCH
        DECLARE @ErrorMessage NVARCHAR(4000) = ERROR_MESSAGE();
        RAISERROR(@ErrorMessage, 16, 1); -- Levantar el error
        ROLLBACK TRANSACTION; -- Hacer rollback si hay una transacción activa
    END CATCH;
END;

SELECT * FROM Articulos;