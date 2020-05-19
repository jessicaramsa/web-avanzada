CREATE DATABASE cap6;
USE cap6;

CREATE TABLE alumno(
    no_control int PRIMARY KEY UNIQUE,
    nombre varchar(50),
    semestre int
);
