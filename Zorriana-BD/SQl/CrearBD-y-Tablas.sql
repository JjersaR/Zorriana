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
  ADD CONSTRAINT PK_Usuario_ID PRIMARY KEY(Usuario_ID),
  ADD CONSTRAINT UQ_Username UNIQUE(Username),
  ADD CONSTRAINT UQ_Correo UNIQUE(Correo),
);

CREATE TABLE Generos(
  Genero_ID int IDENTITY(1,1),
  Genero varchar(50) NOT NULL,
  ADD CONSTRAINT PK_Genero_ID PRIMARY KEY(Genero_ID),
  ADD CONSTRAINT UQ_Genero UNIQUE(Genero)
);

CREATE TABLE Usarios_Datos_Personales(
  Usuarios_Datos_Personales_ID int IDENTITY(1,1),
  Usuario_ID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Apellido_Paterno varchar(50) NOT NULL,
  Apellido_Materno varchar(50) NOT NULL,
  Fecha_Nacimiento date NOT NULL,
  Genero_ID int NOT NULL,
  ADD CONSTRAINT PK_Usuarios_Datos_Personales_ID PRIMARY KEY(Usuarios_Datos_Personales_ID),
  ADD CONSTRAINT FK_Usuario_ID FOREIGN KEY(Usuario_ID) REFERENCES Usuarios(Usuario_ID),
  ADD CONSTRAINT FK_Genero_ID FOREIGN KEY(Genero_ID) REFERENCES Generos(Genero_ID)
);

go;