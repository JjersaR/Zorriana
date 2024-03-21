CREATE PROCEDURE pa_BorrarArticulo
    @ID INT
AS
BEGIN
    SET NOCOUNT ON;

    BEGIN TRY
        BEGIN TRANSACTION; -- Iniciar transacción

        -- Verificar si el artículo existe
        IF EXISTS (SELECT 1 FROM Articulos WHERE Articulo_ID = @ID)
        BEGIN
            -- Borramos de la Categorias_X_Articulos
            DELETE FROM Categorias_X_Articulos WHERE Articulo_ID = @ID;

            -- Borramos el artículo de la tabla Articulos
            DELETE FROM Articulos WHERE Articulo_ID = @ID;

            COMMIT TRANSACTION; -- Confirmar transacción

            -- Retornar un mensaje al cliente
            SELECT 'Producto Borrado Exitosamente' AS Message;
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

EXEC pa_BorrarArticulo @ID = 700

SELECT * FROM Articulos;