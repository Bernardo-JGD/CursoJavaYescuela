#Insertar registros en las tablas 
#Insertar en la tabla Categoria
USE Tienda;
INSERT INTO Categoria VALUES (NULL, "Bebidas");
INSERT INTO Categoria (nombre) VALUES ("Aceites");
INSERT INTO Categoria (nombre) VALUES 
("Detergentes"), ("Galletas"), ("Chocolates"), ("Frituras");
SELECT * FROM Categoria;

#Insertar en la tabla producto

INSERT INTO Producto (nombre, precio, fecha_venta, idCategoria)
VALUES ("Gaseosa Coca Cola", 5.5, "2018-05-31", 1), 
	   ("Gaseosa Inka Cola", 5.4, "2018-05-30", 1), 
	   ("Cerveza Heineken", 3.6, curdate(), 1);

INSERT INTO Producto (nombre, precio, fecha_venta, idCategoria)
VALUES ("Aceite de oliva", 2.7, curdate(), 2);
	   
SELECT * FROM Producto;

#Insertar en la tabla codigo de barras

INSERT INTO CodigoBarras (serial, idProducto) 
VALUES ("123321123321", 1), ("234432234432", 2), ("345543345543", 3), ("456654456654", 4);

SELECT * FROM CodigoBarras; 
