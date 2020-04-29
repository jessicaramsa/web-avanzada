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

INSERT INTO videojuego VALUES(029010, 'Cities Skylines', 'Constructor', 'PC', '300');
INSERT INTO videojuego VALUES(108249, 'Celeste', 'Indie', 'PC/Nintendo Switch', '500');
INSERT INTO videojuego VALUES(120945, 'Bad North Jotunn Edition', 'Combate', 'PC', '200');
INSERT INTO videojuego VALUES(092375, 'Fox Game', 'RPG', 'PC', '900');
INSERT INTO videojuego VALUES(834902, 'Mortal Kombat', 'Combate', 'PC', '599');