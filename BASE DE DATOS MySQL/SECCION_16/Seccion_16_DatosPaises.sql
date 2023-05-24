
CREATE DATABASE DatosPaises;

USE DatosPaises;

CREATE TABLE Paises (

	idPais INT NOT NULL AUTO_INCREMENT, 
    nombre_pais VARCHAR (45) NOT NULL, 
    PRIMARY KEY (idPais)

);

INSERT INTO Paises (nombre_pais) VALUES 
					("Perú"),
                    ("México"),
                    ("Colombia"),
                    ("Ecuador"),
                    ("Argentina"),
                    ("Brasil"),
                    ("España"),
                    ("Parauay"),
                    ("Italia"),
                    ("Francia");

SELECT * FROM Paises;

CREATE TABLE Estado (

	idEstado INT NOT NULL AUTO_INCREMENT, 
    nombre VARCHAR (45) NOT NULL, 
    idPais INT NOT NULL, 
    PRIMARY KEY (idEstado), 
    CONSTRAINT idPais FOREIGN KEY (idPais) 
    REFERENCES Paises (idPais) 
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION

);

SELECT * FROM Estado;

INSERT INTO Estado (nombre, idPais) VALUES 
("Aguascalientes", 2),
("Baja California", 2),
("Nuevo León", 2),
("Tamaulipas", 2),
("Yucatán", 2),
("Lima", 1),
("Loreto", 1),
("Madre de Dios", 1),
("Cicilia", 9), 
("Toscana", 9), 
("Piamonte", 9) ;

SELECT * FROM Estado;

CREATE TABLE Ciudad (

	idCiudad INT NOT NULL AUTO_INCREMENT, 
    nombre VARCHAR (45) NOT NULL, 
    idEstado INT NOT NULL, 
    PRIMARY KEY (idCiudad), 
    CONSTRAINT idEstado FOREIGN KEY (idEstado)
    REFERENCES Estado (idEstado)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION 

);

INSERT INTO Ciudad (nombre, idEstado) VALUES 
					("Abasolo", 4),
                    ("Aldama", 4),
                    ("Altamira", 4),
                    ("Miguel Alemán", 4),
                    ("Antiguo Morelos", 4),
                    ("Nuevo Laredo", 4),
                    ("Tampico", 4),
                    ("Mante", 4),
                    ("Linares", 3),
                    ("Montemorelos", 3),
                    ("Santa Catarina", 3),
                    ("China", 3),
                    ("Monterrey", 3);
                    
SELECT * FROM Ciudad;

