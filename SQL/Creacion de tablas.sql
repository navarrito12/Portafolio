CREATE TABLE BDBiblioteca;
USE BDBiblioteca;
CREATE TABLE IF NOT EXISTS TPais(
nPaisID NUMERIC(3,0) NOT NULL UNIQUE PRIMARY KEY,
cNombre VARCHAR(30) NOT NULL
);

CREATE TABLE TEditorial (
nEditorialID INT AUTO_INCREMENT PRIMARY KEY,
cNombre VARCHAR(40) NOT NULL,
nPaisID NUMERIC(3,0) default 724, 
constraint fk_TEditorial_TPais foreign key (nPaisID) references TPais (nPaisID)
on update cascade 
on delete no action
);

CREATE TABLE  IF NOT EXISTS TSocio (
cNIF CHAR(9) NOT NULL UNIQUE PRIMARY KEY,
cNombre VARCHAR(30) NOT NULL,
cApellidos VARCHAR(60) NOT NULL,
cDireccion VARCHAR(100),
cTelefono CHAR (12) NOT NULL,
dNacimiento DATE NOT NULL,
dAlta DATE NOT NULL CHECK(dAlta >= "2003-09-01")
);

alter table tsocio drop check tsocio_chk_1;

alter table tsocio
	modify dAlta DATE NOT NULL CHECK(dAlta >= "1900-09-01");

CREATE TABLE IF NOT EXISTS TLibro (
nLibroID NUMERIC(3,0) PRIMARY KEY,
cTitulo VARCHAR(20),
dAnyoPublicacion DATE NOT NULL,
nEditorial iNT AUTO_INCREMENT,
CONSTRAINT FK_TLibro_TEditorial FOREIGN KEY (nEditorial) REFERENCES TEditorial (nEditorialID)
);

CREATE TABLE IF NOT EXISTS TPrestamo (
cSignatura VARCHAR(20), 
cNIF VARCHAR(9) NOT NULL,
dPrestamo DATE,
PRIMARY KEY (cSignatura, cNIF, dPrestamo),
CONSTRAINT FK_TSocio_TPrestamo FOREIGN KEY (cNIF) REFERENCES TSocio (cNIF)
);
    
CREATE TABLE IF NOT EXISTS TEjemplar(
cSignatura VARCHAR(20) PRIMARY KEY,
nLibroID NUMERIC(3,0),
CONSTRAINT FK_TEjemplar_TPrestamo FOREIGN KEY (cSignatura) REFERENCES TPrestamo (cSignatura),
CONSTRAINT FK_TEjemplar_TLibrotlibro FOREIGN KEY (nLibroID) REFERENCES TLibro (nLibroID)
);

CREATE TABLE IF NOT EXISTS TTema(
nTemaID NUMERIC(3,0) PRIMARY KEY,
cNombre VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS TLibroTema(
nLibroID NUMERIC(3,0),
nTemaID NUMERIC(3,0),
PRIMARY KEY (nLibroID, nTemaID),
CONSTRAINT FK_Tlibro_Tema1 FOREIGN KEY (nLibroID) REFERENCES TLibro (nLibroID),
CONSTRAINT FK_Tlibro_Tema2 FOREIGN KEY (nTemaID) REFERENCES TTema (nTemaID)
);

CREATE TABLE IF NOT EXISTS TAutor(
nAutorID NUMERIC(3,0) PRIMARY KEY,
cNombre VARCHAR(20),
cApellidos VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS TLibroAutor(
nLibroID NUMERIC(3,0),
nAutorID NUMERIC(3,0),
PRIMARY KEY (nLibroID, nAutorID),
CONSTRAINT FK_TLibro_Autor1 FOREIGN KEY (nLibroID) REFERENCES TLibro (nLibroID),
CONSTRAINT FK_Libro_Autor2 FOREIGN KEY (nAutorID) REFERENCES TAutor (nAutorID)
);

CREATE TABLE IF NOT EXISTS TAutorPais(
nAutorID NUMERIC(3,0),
nPaisID NUMERIC(3,0),
PRIMARY KEY (nAutorID, nPaisID),
CONSTRAINT FK_TAutor_TPais1 FOREIGN KEY (nAutorID) REFERENCES TAutor (nAutorID),
CONSTRAINT FK_TAutor_TPais2 FOREIGN KEY (nPaisID) REFERENCES TPais (nPaisIDtautorpaistautorpaistautorpaistautorpaistautorpais)
);