/**
 * Author:  jessicaramsa
 * Created: 7/03/2020
 */

CREATE DATABASE videojuegos;
USE videojuegos;

CREATE TABLE videojuego(
	clave int(6),
	nombre varchar(150),
	genero varchar(150),
	plataforma varchar(150),
	precio varchar(150)
);

INSERT INTO videojuego VALUES(029010, 'Inside', '', '', '300');