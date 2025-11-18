select concat(cnombre, " - ", cApellidos) as "datos Socio" from tsocio;

insert into tsocio (cNIF, cnombre, cApellidos, cDireccion, cTelefono, dAlta, cEmail, Nacimiento) values
('123456789', 'Javier', 'García Sanchez', null, '123456789012', '2025-10-22', "javiergarcias@gmail.com", '1997-04-05');

select * from tsocio where cdireccion is not null;

select * from tsocio where cnombre like "%a";

insert into tsocio values
('12345678B', 'Jacinto', 'García López', 'Calle Mayor 1, Madrid', '600123456789', '1999-01-15', 'ana.garcia@example.com', '1989-05-12');

insert into tsocio values
('12345678C', 'Jacinto', 'García López', 'Calle Mayor 1, Madrid', '600123456789', '1999-01-15', 'ana.garcia@example.com', '1960-05-12');

select * from tsocio where cnombre = 'Jacinto' and Nacimiento < '1970-01-01' and dalta between '1990-01-01' and '2000-12-31';

select * from tlibro where nLibroID not in (15, 32) or dAnyoPublicacion < '2000-01-01';

select cnombre, cApellidos from tsocio where telefono is not null and direccion is null;

select * from tautoe where capellidos = "Byatt" and cnombre like "A%s%";