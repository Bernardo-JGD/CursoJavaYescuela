#Insercion para eliminar en la tabla produtos Tienda

USE Tienda;

INSERT INTO Producto
(nombre, precio, fecha_venta, idCategoria, cantidad)
VALUES ("Sabritas", 10.5, curdate(), 6, 50), 
       ("Doritos", 8.6, curdate(), 6, 38),
       ("Limon", 3.8, curdate(), 6, 25), 
       ("Manzana", 5.3, curdate(), 6, 40);
       
INSERT INTO CodigoBarras (serial, idProducto)
VALUES ("567765567765", 5), 
	   ("678876678876", 6), 
       ("789987789987", 7), 
       ("890098890098", 8);       

SELECT * FROM Producto;
SELECT * FROM CodigoBarras;
SELECT * FROM Categoria;