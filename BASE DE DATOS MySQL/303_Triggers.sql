#Triggers

USE Tienda;

DELIMITER |
CREATE TRIGGER insertTemp BEFORE INSERT ON Categoria 
FOR EACH ROW 
BEGIN 

	INSERT INTO Temporal (categoria) VALUES (NEW.nombre);

END |

INSERT INTO Categoria (nombre) VALUES ("Frituras");
SELECT * FROM Categoria;
SELECT * FROM Temporal;





