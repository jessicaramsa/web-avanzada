/**
 * Author:  Uroboros
 * Created: 24/02/2020
 */

create database sistemalogin;
use sistemalogin;

create table usuarios (
    cuenta VARCHAR(100),
    nombre VARCHAR(200),
    clave VARCHAR(100),
    mail VARCHAR(150)
);

insert into usuarios values('jessicaramsa', 'Jessica Ramirez', '123456', 'jessicaramsa@gmail.com');
insert into usuarios values('pruebas', 'Mr. Testing', '654321', 'pruebas@gmail.com');