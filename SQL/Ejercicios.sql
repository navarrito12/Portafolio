-- ejercicios propuestos pag 128
select cTitulo from tlibro where danyopublicacion between "1926-01-01" and "1978-12-31" and neditorialID != 32;

select cnombre, capellidos from tsocio where dAlta between "2009-12-31" and current_date() and cdireccion is not null;

select distinct npaisid from teditorial where npaisid is not null;

-- bloque 1
-- 1 
select FirstName, LastName from customer;
-- 2
select concat(lastname, ", ", firstname) as "nombre y apellidos" from customer ;
-- 3
select distinct Country from customer;
-- 4
select distinct country from customer order by country asc;
-- 5
select count(*) from customer;
-- 6
select count(*) from customer where Email is not null;
-- 7
select count(*) from customer where fax is not null;
-- 8
select country, count(*) from customer group by country;
-- 9
select country, count(*) from customer group by country order by count(*) desc;
-- 10
select country, count(*) from customer group by country having count(country) > 1 order by count(*);
-- 11
select PostalCode from customer where country = "Spain";

-- Bloque 2
-- 1
select * from employee where reportsto is null;
-- 2
select * from employee where birthdate between "1960-01-01" and "1969-12-31";
-- 3
select distinct title from employee;
-- 4
select title, count(*) from employee group by title;

-- bloque 3
-- 1
select max(unitprice), min(unitprice) from track;
-- 2
select avg(milliseconds) from track;
-- 3
select avg(milliseconds) / 1000 / 60 from track;

-- mostrar los empleados que son jefes junto con el nº de empleados que supervisa cada uno
select EmployeeId, FirstName, ReportsTo from employee;

-- mostrar 5 canciones más largas de cada genero incluyendo nombre de cancion y genero
select GenreId, Name from track order by milliseconds limit 5;

-- mostrar canciones que aparecen en más de 3 listas de reproduccion diferentes, incluyendo su nombre

-- 5.3 pág 109
-- Listar el título de los libros de la editorial 32 junto con su tema o temas.
select ctitulo, teditorial.neditorialid, ttema.cnombre 
from tlibro inner join teditorial inner join tlibrotema inner join ttema 
on tlibro.nEditorialID = teditorial.nEditorialID and tlibro.nLibroID = tlibrotema.nLibroID and tlibrotema.nTemaID = ttema.nTemaID 
where teditorial.neditorialid = 10;

-- Mostrar el nombre y apellidos de todos los autores con libros publicados junto con el número de libros que tienen en la biblioteca.
select tautor.cnombre, tautor.capellidos, count(*)
from tautor inner join tlibroautor
on tautor.nautorid = tlibroautor.nautorid
group by tautor.nautorid, tautor.cnombre, tautor.capellidos;

-- Mostrar el nombre y apellidos de todos los autores con libros publicados junto con el año de publicacion más antiguo de todos sus libros 
select tautor.cnombre, tautor.capellidos, min(tlibro.danyopublicacion)
from tautor inner join tlibroautor inner join tlibro
on tautor.nautorid = tlibroautor.nautorid and tlibroautor.nlibroid = tlibro.nlibroid
group by tautor.nautorid;

-- por cada signatura y fecha de préstamo, mostrar el título del libro correspondiente y el nombre y apellidos del socio que se lo llevó en préstamo
select tprestamo.cSignatura, tprestamo.dPrestamo
from tprestamo inner join tlibro;

-- con el inner join solo salen las consultas donde aparece en las dos tablas

insert into tsocio values
("1234567AB", "Juan", "López garcía", "calle estampita 4", "101112131415", "2024-01-01", "hola@gmail.com", "1975-03-07");

-- left join, rigth join, inner join
select tsocio.*, tprestamo.* 
from tsocio left join tprestamo
ON tsocio.cnif = tprestamo.cNIF
;