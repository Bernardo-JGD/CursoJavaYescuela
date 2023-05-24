#Consultas más avanzadas con operadores

USE Tienda;

SELECT * FROM Producto;

#Operador AND
SELECT * FROM Producto WHERE idCategoria = 1 AND precio >4;

#Operadror OR
SELECT * FROM Producto WHERE idCategoria = 1 OR precio>4;

#Operador "Diferente de" "!="
SELECT * FROM Producto WHERE idCategoria != 1;

#Mayor o igual
SELECT * FROM Producto WHERE precio >=3;

#Filtrar columnas con valor nulo
SELECT * FROM Producto WHERE cantidad IS NULL;

#Filtrar columnas con valor NO nulo
SELECT * FROM Producto WHERE cantidad IS NOT NULL;

#BETWEEN para buscar en un rango de valores 
SELECT * FROM Producto WHERE precio BETWEEN 3 AND 5.30;

#NOT BETWEEN para buscar FUERA de rango de valores

SELECT * FROM Producto WHERE precio NOT BETWEEN 3 AND 5.30;

/*LIKE
	Al colocar % despues de una cadena indico que busque 
    valores que empiecen con esa cadena pero que pueden
    llevar mas texto. Si va antes es lo contrario, termina con
    la cadena y antes lleva texto
*/
SELECT * FROM Producto WHERE nombre LIKE 'Gaseosa%';
SELECT * FROM Producto WHERE nombre LIKE '%a';

#Cuando ponemso %cadena% indicamos que entre las letras
#de una cadena puede incluir la cadena que le indicamos
#en medio de los dos simbolos de porcentaje

SELECT * FROM Producto WHERE nombre LIKE '%osa%'


