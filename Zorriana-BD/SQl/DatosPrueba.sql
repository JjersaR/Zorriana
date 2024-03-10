INSERT INTO Categorias (Nombre_Categoria)
VALUES 
    ('Vibradores'),
    ('Lencería'),
    ('Juguetes Anales'),
    ('Aceites y Lubricantes'),
    ('BDSM'),
    ('Juguetes para Parejas');

ALTER TABLE Articulos
DROP  FK_Categoria_X_Articulo_ID;

ALTER TABLE Articulos
DROP COLUMN Categoria_X_Articulo_ID;
-- Insertar datos de ejemplo en la tabla Articulos
INSERT INTO Articulos (Nombre, Descripcion, Disponible, Precio, Num_Veces_Vendido, Link_Imagen)
VALUES
    ('Vibrador Clásico', 'Vibrador clásico de alta calidad con múltiples velocidades.', 1, 29.99, 50, 'https://placehold.co/600x400'),
    ('Conjunto de Lencería de Encaje', 'Conjunto de lencería de encaje de tres piezas en color negro.', 1, 39.99, 30, 'https://placehold.co/600x400'),
    ('Plug Anal de Silicona', 'Plug anal de silicona suave y flexible para principiantes.', 1, 19.99, 20, 'https://placehold.co/600x400'),
    ('Aceite de Masaje Afrodisíaco', 'Aceite de masaje con aroma a lavanda y jazmín para aumentar la sensualidad.', 1, 14.99, 35, 'https://placehold.co/600x400'),
    ('Conjunto de Bondage', 'Conjunto completo de bondage para juegos de sumisión y dominación.', 1, 49.99, 15, 'https://placehold.co/600x400'),
    ('Vibrador para Parejas', 'Vibrador con control remoto para parejas con varias velocidades y modos de vibración.', 1, 59.99, 25, 'https://placehold.co/600x400');


INSERT INTO Categorias_X_Articulos (Articulo_ID, Categoria_ID)
VALUES
	(3, 1),
	(4, 2),
	(5, 3),
	(6, 4),
	(7, 5),
	(8, 6)