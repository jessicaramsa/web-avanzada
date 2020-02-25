/**
 * Author:  Uroboros
 * Created: 24/02/2020
 */

create database sistemalogin;
use sistemalogin;

create table usuarios (
    cuenta VARCHAR(100),
    nombre VARCHAR(100),
    clave VARCHAR(100),
    mail VARCHAR(150)
);