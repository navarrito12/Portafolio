select danyopublicacion, count(*)
from tlibro group by danyopublicacion;

select danyopublicacion, neditorialid, count(*)
from tlibro group by danyopublicacion;

select cnif, count(*)
from tprestamo
group by cnif 
having count(*) > 0;

insert into tlibro values
(32, 'Hola mundo', '1993-04-04', 2);
-- a) pag 107 
select count(*)
from tlibro where nLibroID =32 and dAnyoPublicacion between '1993-01-01' and '1993-12-31';

insert into tsocio values
('50687452Y', 'Jacinto', 'García López', 'Calle Mayor 1, Madrid', '600123456789', '1999-01-15', 'ana.garcia@example.com', '1960-05-12');

INSERT INTO TPrestamo (cSignatura, cNIF, dPrestamo) VALUES
('EJ011', '50687452Y', '2014-01-01'),
('EJ012', '50687452Y', '2014-01-01'),
('EJ013', '50687452Y', '2014-01-02'),
('EJ014', '50687452Y', '2023-01-04'),
('EJ015', '50687452Y', '2023-01-05');

-- b) pag 107
select cnif, dprestamo, count(*)
from tprestamo where cnif = '01234567J' and dprestamo between '2023-01-01' and '2023-12-31'
group by dprestamo ;

-- c) pag 107
select cnif, dprestamo, count(*) as "prestamos"
from tprestamo where cnif = '01234567J' and dprestamo between '2023-01-01' and '2023-12-31'
group by dprestamo 
having prestamos >= 3;

-- d) pag 107
select * from tsocio order by dalta desc, cApellidos, cNombre;

select distinct ctprestamoNombre from tsocio;