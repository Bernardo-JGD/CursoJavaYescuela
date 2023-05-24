#Consultas en las tablas

USE Tienda;

#Para seleccionar todas las columnas de una tabla
#agregamos un asterisco despues de un "SELECT"
SELECT * FROM Producto;

#Para seleccionar una sola columna escribimos el 
#nombre despues del select y si queremos más las
# separamos por ","
SELECT nombre FROM Producto;
SELECT nombre, precio, cantidad FROM Producto;

#agregar una alias a la columna sin que se altere 
#el nombre original, es un nombre temporal mientras
#se muestra
SELECT nombre AS 'Nombre del producto', 
precio AS 'Precio del producto', cantidad FROM Producto;

#Consulta filtrada o consulta especifica con WHERE
SELECT nombre, precio, cantidad FROM Producto
WHERE idCategoria = 1;

SELECT nombre, precio, cantidad FROM Producto
WHERE idProducto = 2;

#Consulta filtrada o consulta especifica con WHERE
#usando operadores 

SELECT nombre, cantidad, precio FROM Producto
WHERE precio >4;

#MIN es para calcular y mostrar el menor de una columna
#MAX es para calcular y mostrar el mayor de una columna
#NOTA: tiene que ser pegadito para que funcione
SELECT MIN(precio) FROM Producto;
SELECT MAX(precio) FROM producto;

SELECT MAX(precio), MIN(precio) FROM Producto;

SELECT MAX(precio) AS 'Precio maximo', 
MIN(precio) AS 'Precio minimo' FROM Producto;

#ORDENAMIENTO
#Ordenar alfabeticamente
SELECT nombre, precio FROM Producto ORDER BY nombre ASC;
SELECT nombre, precio FROM Producto ORDER BY nombre DESC;



  
