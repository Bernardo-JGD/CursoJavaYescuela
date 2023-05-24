#Vistas
USE Tienda;

CREATE VIEW PCBC_3 AS 
SELECT p.nombre AS 'Producto', cb.serial AS 'Codigo Barras',
c.nombre AS 'Categoria'
FROM Producto AS p 
INNER JOIN CodigoBarras cb ON p.idProducto = cb.idProducto
INNER JOIN Categoria c ON p.idCategoria = c.idCategoria;

SELECT * FROM PCBC_3;

CREATE VIEW Vista_Producto_Categoria AS 
SELECT p.nombre, p.precio, p.cantidad, c.nombre AS 'Categoria'
FROM Producto AS p 
INNER JOIN Categoria AS c ON p.idCategoria = c.idCategoria;

SELECT * FROM Vista_Producto_Categoria;