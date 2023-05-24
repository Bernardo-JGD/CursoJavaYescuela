#Crear la base de datos escuela 
CREATE DATABASE Escuela;

#Usar la base de datos escuela 
USE Escuela;

#Crear la tabla persona 
CREATE TABLE Persona (

	idPersona INT NOT NULL AUTO_INCREMENT, 
    nombre VARCHAR (50) NOT NULL, 
    domicilio VARCHAR (200) NOT NULL, 
    celular VARCHAR (10) NULL, 
    correo_electronico VARCHAR (50) NULL, 
    fecha_nacimiento DATE NULL, 
    genero VARCHAR (10) NULL,
	PRIMARY KEY (idPersona)

);

#Mostrar los registros de la tabla persona 
SELECT * FROM Persona;

#Insertar 
INSERT INTO Persona (nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero)
VALUES('Alejandro', 'Calle Primavera #456', '1236548907', 'alejandro@hotmail.com', '1996-04-19', 'Masculino');
