/**
 * Author:  jessicaramsa
 * Created: 7/03/2020
 */

CREATE DATABASE materiasIngComp;
USE materiasIngComp;

CREATE TABLE ueas (
    clave int(6),
    nombre varchar(50),
    trimestre int(3),
    requiere varchar(50)
);

INSERT INTO ueas VALUES(460006, 'Fundamentos de Programacion', 1, '');
INSERT INTO ueas VALUES(460010, 'Programación Orientada a Objetos', 2, 'Fundamentos de Programacion');
INSERT INTO ueas VALUES(460014, 'Estructura de Datos', 3, 'Programación Orientada a Objetos');
INSERT INTO ueas VALUES(460018, 'Topicos Avanzados de Programacion', 4, 'Estructura de Objetos');
INSERT INTO ueas VALUES(480909, 'Programacion Logica y Funcional', 8, '');
INSERT INTO ueas VALUES(480916, 'Inteligencia Artificial', 9, 'Programacion Logica y Funcional');
INSERT INTO ueas VALUES(470899, 'Fundamentos de Ingenieria de Software', 5, '');
INSERT INTO ueas VALUES(470990, 'Ingenieria de Software', 6, 'Fundamentos de Ingenieria de Software');
INSERT INTO ueas VALUES(470997, 'Gestion de Proyectos de Software', 7, 'Ingenieria de Software');
INSERT INTO ueas VALUES(440923, 'Programacion Web', 8, '');
INSERT INTO ueas VALUES(440937, 'Programacion Web Avanzada', 9, 'Programacion Web');
INSERT INTO ueas VALUES(490923, 'Administracion de Redes', 8, 'Conmutacion de Redes');
