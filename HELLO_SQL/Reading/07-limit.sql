/*
Limit sirve para que me muestre hasta donde yo quiero, le pongo un limite
*/

SELECT * FROM users LIMIT 2;

SELECT * FROM users WHERE NOT email = 'pedro@gmail.com' OR age=18 LIMIT 2;