DROP TABLE IF EXISTS TEmpleado;

CREATE TABLE if not exists TEmpleado (
nEmpleadoID INT PRIMARY KEY,
cNombre VARCHAR(20),
nDepartamentoID INT
);

DROP TABLE IF EXISTS TDepartamento;

CREATE TABLE TDepartamento (
  nDepartamentoID INT PRIMARY KEY,
  cNombre VARCHAR(20),
  nEmpleadoID INT
);

alter table tDepartamento
   add constraint FK_TDepartamento_TEmpleado foreign key (nEmpleadoID) references templeado(nEmpleadoID);

alter table TEmpleado
	add constraint FK_TEmpleado_TDepartamento foreign key (nDepartamentoID) references TDepartamento(nDepartamentoID);
