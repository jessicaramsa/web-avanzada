CREATE DATABASE db_tutorias;
USE db_tutorias;

CREATE TABLE profesores(
    id_profesor integer PRIMARY KEY,
    profesor varchar(50) NOT NULL
);

INSERT INTO profesores VALUES(315, 'Fco. Javier Ceballos Sierra');
INSERT INTO profesores VALUES(317, 'Inmaculada Rodríguez Santiago');
INSERT INTO profesores VALUES(238, 'Concha Batanero Ochaita');
INSERT INTO profesores VALUES(318, 'M. Dolores Rodríguez Moreno');
INSERT INTO profesores VALUES(237, 'Martín Knoblauch Revuelta');

CREATE TABLE tutorias(
    id_tutoria integer PRIMARY KEY,
    id_profesor integer NOT NULL,
    dia varchar(10) NOT NULL,
    hora varchar(5) NOT NULL
);

INSERT INTO tutorias VALUES(1, 315, 'lunes', '10');
INSERT INTO tutorias VALUES(2, 315, 'lunes', '12');
INSERT INTO tutorias VALUES(3, 315, 'miércoles', '16');
INSERT INTO tutorias VALUES(4, 315, 'miércoles', '18');
INSERT INTO tutorias VALUES(5, 317, 'lunes', '12');
INSERT INTO tutorias VALUES(6, 317, 'miércoles', '10');
INSERT INTO tutorias VALUES(7, 317, 'jueves', '12');
INSERT INTO tutorias VALUES(8, 317, 'viernes', '16');
INSERT INTO tutorias VALUES(9, 238, 'lunes', '10');
INSERT INTO tutorias VALUES(10, 238, 'miércoles', '12');
INSERT INTO tutorias VALUES(11, 238, 'miércoles', '16');
INSERT INTO tutorias VALUES(12, 238, 'viernes', '16');
INSERT INTO tutorias VALUES(13, 318, 'martes', '10');
INSERT INTO tutorias VALUES(14, 318, 'martes', '18');
INSERT INTO tutorias VALUES(15, 318, 'jueves', '10');

CREATE TABLE citas(
    id_tutoria integer PRIMARY KEY,
    alumno varchar(50) NOT NULL,
    asunto varchar(200) NOT NULL
);

INSERT INTO citas VALUES(1, 'Diego Jiménez Alonso', 'Programación Avanzada');
INSERT INTO citas VALUES(3, 'Fco. Javier Ceballos Sierra', 'Programación Visual');
INSERT INTO citas VALUES(5, 'Juan Ángel Ferrera Perales', 'Programación Avanzada');
INSERT INTO citas VALUES(8, 'Lidia Calvo Díaz', 'Ftos. de Programación');
INSERT INTO citas VALUES(9, 'Carlos Gómez Cuero', 'Ftos. de Informática');
INSERT INTO citas VALUES(12, 'Ana María Cóbreces Álvarez', 'Ftos. de Informática');
INSERT INTO citas VALUES(13, 'Ricardo García Muñoz', 'Programación Avanzada');
INSERT INTO citas VALUES(16, 'Alicia Espejo Díaz', 'Programación Avanzada');
