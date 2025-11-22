/*
As sirve para cambiarle el nombre a la columna.
Concat sirve para elegir unas cosas en concreto como nombre y apellido.
*/

SELECT name, init_date AS 'Fecha de nacimiento' FROM users WHERE name = 'Andrea';

SELECT name, init_date AS "Fecha de nacimiento" FROM users WHERE name = "Andrea";

SELECT CONCAT('Nombre: ', name, ' ', username) FROM users;

SELECT CONCAT('Nombre: ', name, ' ', username) AS 'Nombre completo' FROM users;