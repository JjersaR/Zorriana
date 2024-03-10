CREATE DATABASE ZorrianaBD collate SQL_Latin1_General_CP1_CI_AS;

go;

-- Tablas de la base de datos
--Tablas de usuario:
CREATE TABLE Usuarios(
  Usuario_ID int IDENTITY(1,1),
  Username varchar(12) NOT NULL,
  User_Password varchar(50) NOT NULL,
  Correo varchar(50) NOT NULL,
  Num_Celular varchar(15) NOT NULL,
  Fecha_Creacion DATETIME NOT NULL,
  Ultimo_Inicio_Sesion DATETIME NOT NULL,
  CONSTRAINT PK_Usuario_ID PRIMARY KEY(Usuario_ID),
  CONSTRAINT UQ_Username UNIQUE(Username),
  CONSTRAINT UQ_Correo UNIQUE(Correo),
);

CREATE TABLE Generos(
  Genero_ID int IDENTITY(1,1),
  Genero varchar(50) NOT NULL,
  CONSTRAINT PK_Genero_ID PRIMARY KEY(Genero_ID),
  CONSTRAINT UQ_Genero UNIQUE(Genero)
);

CREATE TABLE Usarios_Datos_Personales(
  Usuarios_Datos_Personales_ID int IDENTITY(1,1),
  Usuario_ID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Apellido_Paterno varchar(50) NOT NULL,
  Apellido_Materno varchar(50) NOT NULL,
  Fecha_Nacimiento date NOT NULL,
  Genero_ID int NOT NULL,
  CONSTRAINT PK_Usuarios_Datos_Personales_ID PRIMARY KEY(Usuarios_Datos_Personales_ID),
  CONSTRAINT FK_Usuario_ID FOREIGN KEY(Usuario_ID) REFERENCES Usuarios(Usuario_ID),
  CONSTRAINT FK_Genero_ID FOREIGN KEY(Genero_ID) REFERENCES Generos(Genero_ID)
);

go;

--Roles de usuario

CREATE TABLE Roles(
  Rol_ID int IDENTITY(1,1),
  Nombre varchar(50) NOT NULL,
  CONSTRAINT PK_Rol_ID PRIMARY KEY(Rol_ID),
  CONSTRAINT UQ_Rol UNIQUE(Nombre)
);

CREATE TABLE Roles_X_Usuario(
  Rol_X_Usuario_ID int IDENTITY(1,1),
  Usuario_ID int NOT NULL,
  Rol_ID int NOT NULL,
  CONSTRAINT PK_Rol_X_Usuario_ID PRIMARY KEY(Rol_X_Usuario_ID),
  CONSTRAINT FK_Usuario_ID_Rol FOREIGN KEY(Usuario_ID) REFERENCES Usuarios(Usuario_ID),
  CONSTRAINT FK_Rol_ID FOREIGN KEY(Rol_ID) REFERENCES Roles(Rol_ID)
);

go;

--Tablas de Articulos

CREATE TABLE Categorias(
  Categoria_ID int IDENTITY(1,1),
  Nombre_Categoria varchar(50) NOT NULL,
  CONSTRAINT PK_Categoria_ID PRIMARY KEY(Categoria_ID),
  CONSTRAINT UQ_Nombre_Categoria UNIQUE(Nombre_Categoria)
);

CREATE TABLE Articulos(
  Articulo_ID int IDENTITY(1,1),
  Nombre varchar(50) NOT NULL,
  Descripcion varchar(500) NOT NULL,
  Disponible bit NOT NULL,
  Precio decimal(10,2) NOT NULL,
  Num_Veces_Vendido int NOT NULL,
  Link_Imagen varchar(500) NOT NULL,
  CONSTRAINT PK_Articulo_ID PRIMARY KEY(Articulo_ID),
);

CREATE TABLE Categorias_X_Articulos(
  Categoria_X_Articulo_ID int IDENTITY(1,1),
  Categoria_ID int NOT NULL,
  Articulo_ID int NOT NULL,
  CONSTRAINT PK_Categoria_X_Articulo_ID PRIMARY KEY(Categoria_X_Articulo_ID),
  CONSTRAINT FK_Categoria_ID FOREIGN KEY(Categoria_ID) REFERENCES Categorias(Categoria_ID),
  CONSTRAINT FK_Articulo_ID FOREIGN KEY(Articulo_ID) REFERENCES Articulos(Articulo_ID)
);

GO;

--Tablas de Ventas

CREATE TABLE Venta_Articulos(
  Venta_Articulo_ID int IDENTITY(1,1),
  Usuario_ID int NOT NULL,
  Fecha_Venta DATETIME NOT NULL,
  Total_Venta decimal(10,2) NOT NULL,
  CONSTRAINT PK_Venta_Articulo_ID PRIMARY KEY(Venta_Articulo_ID),
  CONSTRAINT FK_Usuario_ID_Venta_Articulo FOREIGN KEY(Usuario_ID) REFERENCES Usuarios(Usuario_ID)
);

CREATE TABLE Detalle_Venta_Articulos(
  Detalle_Venta_ID int IDENTITY(1,1),
  Venta_Articulo_ID int NOT NULL,
  Articulo_ID int NOT NULL,
  Cantidad int NOT NULL,
  SubTotal decimal(10,2) NOT NULL,
  CONSTRAINT PK_Detalle_Venta_ID PRIMARY KEY(Detalle_Venta_ID),
  CONSTRAINT FK_Venta_Articulo_ID FOREIGN KEY(Venta_Articulo_ID) REFERENCES Venta_Articulos(Venta_Articulo_ID),
  CONSTRAINT FK_Articulo_ID_Detalle_Venta FOREIGN KEY(Articulo_ID) REFERENCES Articulos(Articulo_ID)
);