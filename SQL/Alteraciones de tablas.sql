alter table Tsocio
	modify cnombre varchar(41);

alter table Tsocio
	add cEmail varchar(100),
    drop dNacimiento,
    modify cDireccion varchar (105);
    
alter table Tsocio
	add Nacimiento date;
    
-- eliminar de la tabla libro la restriccion de clave ajena
alter table tlibro
	drop foreign key Tlibro_TEditorial_FK;

alter table Tlibro
	add constraint FK_TLibro_TEditorial foreign key (nEditorialI) references teditorial (nEditorialID);

alter table tlibro
	rename column nEditorial to nEditorialIDtlibro;
    
