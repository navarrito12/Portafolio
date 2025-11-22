/*
Like sirve para seleccionar a los que tengan eso en concreto en la tabla, es decir, yo tengo una 
tabla gigante y quiero que me muestro los que su correo es gmail.com.
*/

SELECT * FROM users WHERE email LIKE '%gmail.com';

SELECT * FROM users WHERE email LIKE 'pedro%';

SELECT * FROM users WHERE email LIKE '%@%';