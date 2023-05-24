#Estamos creando la base de datos
CREATE DATABASE Tienda;

#Le decimos que utilizaremos la base de datos tienda
USE Tienda;

#Creacion de una tabla para la baes de datos tienda 
CREATE TABLE Producto(

	idProducto INT AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(50) NOT NULL, 
    precio DECIMAL (10, 2) NOT NULL, 
    fecha_venta DATE DEFAULT '00-00-0000'

);
-- para mostrar las tablas 
SHOW TABLES;

-- para mostrar columnas
SHOW COLUMNS FROM Producto;

-- para eliminar una tabla
DROP TABLE Producto;

