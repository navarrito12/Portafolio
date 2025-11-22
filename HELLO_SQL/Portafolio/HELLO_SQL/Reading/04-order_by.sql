/*
Sirve para ordenar, puedes tambien ordenar ascendente o descendente
*/

SELECT * FROM users ORDER BY age;

SELECT * FROM users ORDER BY age ASC;

SELECT * FROM users ORDER BY age DESC;

SELECT * FROM users WHERE email='pedro@gmail.com' ORDER BY age ASC;

SELECT name FROM users WHERE email='pedro@gmail.com' ORDER BY age ASC;