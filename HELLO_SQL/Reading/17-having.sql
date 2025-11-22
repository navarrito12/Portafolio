/*
Hvaing es una limitación sobre una propia columna agregada que nosotros tambien estamos definiendo.
*/

SELECT COUNT(age) FROM users HAVING COUNT(age) > 3;