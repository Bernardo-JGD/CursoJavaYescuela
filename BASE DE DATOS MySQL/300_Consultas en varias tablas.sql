#Consultas en varias tablas 

USE Tienda;


#INNER JOIN
SELECT * FROM Producto AS p 
INNER JOIN categoria AS c 
ON p.idCategoria = c.idCategoria;

#INNER JOIN con columnas seleccionadas
SELECT p.nombre, p.precio, p.cantidad, c.nombre AS 'Categoria'
FROM Producto AS p INNER JOIN Categoria AS c
ON p.idCategoria = c.idCategoria;

#INNER JOIN con condicion where 
SELECT p.nombre, p.precio, p.cantidad, c.nombre AS 'Categoria'
FROM Producto AS p INNER JOIN Categoria AS c
ON p.idCategoria = c.idCategoria WHERE p.precio>3;

SELECT p.nombre AS 'Producto', cb.serial AS 'Codigo Barras'
FROM Producto AS p INNER JOIN CodigoBarras cb
ON p.idProducto = cb.idProducto;

#INNER JOIN con 3 tablas 
SELECT p.nombre AS 'Producto', cb.serial AS 'Codigo Barras',
c.nombre AS 'Categoria', pv.nombre AS 'Proveedor'
FROM Producto AS p 
INNER JOIN CodigoBarras cb ON p.idProducto = cb.idProducto
INNER JOIN Categoria c ON p.idCategoria = c.idCategoria
INNER JOIN Union_pp AS upp ON p.idProducto = upp.idProducto
INNER JOIN Proveedor AS pv ON pv.idProveedor = upp.idProveedor;

