

#creando la base de datos
CREATE DATABASE Tiendita;

USE Tiendita;

CREATE TABLE Producto (

	idProducto INT NOT NULL AUTO_INCREMENT, 
    codigo VARCHAR (45) NOT NULL, 
    nombre VARCHAR (45) NOT NULL, 
    precio DECIMAL (10, 2) NOT NULL, 
    cantidad INT NOT NULL, 
    PRIMARY KEY (idProducto)

);

INSERT INTO Producto (codigo, nombre, precio, cantidad) 
VALUES ("001", "Frituras", 1.5, 100),
	   ("002", "Chocolates", 1.3, 200),
       ("003", "Galletas", 2.5, 250),
       ("004", "Bombones", 1.8, 200),
       ("005", "Juguetes", 2.5, 60),
       ("006", "Pilas", 0.5, 59);
       
SELECT * FROM Producto;       


