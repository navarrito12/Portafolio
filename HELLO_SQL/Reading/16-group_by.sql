/*
Group by sirve para grupar filas que tienen mismos valores, es decir, buscar algo muy en concreto.
MAX: Máximo de las edades.
COUNT: Contar las edades y cuantas hay
*/

SELECT MAX(age) FROM users GROUP BY  age;

SELECT COUNT(age), age FROM users GROUP BY  age;

SELECT COUNT(age), age FROM users GROUP BY  age ORDER BY age ASC;

SELECT COUNT(age), age FROM users WHERE age < 19 GROUP BY  age ORDER BY age ASC;