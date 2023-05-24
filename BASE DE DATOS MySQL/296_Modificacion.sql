#Modificar registros de una tabla

#Modificar la tabla Categoria
UPDATE Categoria SET nombre = "Bebidas con gas"
WHERE idCategoria = 1;

SELECT * FROM Categoria;

#Modificar la tabla Producto

UPDATE Producto SET nombre = "Gaseosa Pepsi", precio = 5.2
WHERE idProducto = 2;

UPDATE Producto SET cantidad = 150 WHERE idProducto = 1;

SELECT * FROM Producto;
