#Procedimientos almacenados
USE Tienda;
DELIMITER //
CREATE PROCEDURE ProductoXCategoria (IN id INT)
BEGIN 

	SELECT * FROM Producto WHERE idCategoria = id;

END //
DELIMITER ;

CALL ProductoXCategoria (1);

DROP PROCEDURE ProductoXCategoria;
DROP VIEW vista_producto_categoria;