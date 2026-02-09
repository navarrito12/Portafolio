CREATE DATABASE Biblioteca; -- Creación Base de Datos

USE Biblioteca;

-- Tabla para almacenar la información de los autores
CREATE TABLE Autores (
	ID_Autor INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Nombre VARCHAR(50) NOT NULL,
	Apellido VARCHAR(50) NOT NULL,
);

-- Tabla para almacenar los libros
CREATE TABLE Libros (
	ID_Libro INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	ID_Autor INT NOT NULL,
	Titulo VARCHAR(50) NOT NULL,
	Año_Publicacion INT NULL,
	FOREIGN KEY (ID_Autor) REFERENCES Autores(ID_Autor)
);

-- Tabla para registrar los préstamos de libros
CREATE TABLE Prestamos (
	ID_Prestamo INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	ID_Libro INT NOT NULL,
	Fecha_Prestamo DATE NULL,
	Fecha_Devolucion DATE NULL,
	FOREIGN KEY (ID_Libro) REFERENCES Libros(ID_Libro)
);

-- Inserción de 10 autores
INSERT INTO Autores (Nombre, Apellido) VALUES 
	('Miguel', 'de Cervantes'), 
	('Gabriel', 'García Márquez'), 
	('Isabel', 'Allende'), 
	('Jorge Luis', 'Borges'), 
	('Julio', 'Cortázar'), 
	('Mario', 'Vargas Llosa'), 
	('Federico', 'García Lorca'), 
	('Pablo', 'Neruda'), 
	('Gabriela', 'Mistral'), 
	('Carlos', 'Fuentes');

-- Inserción de 10 libros 
INSERT INTO Libros (ID_Autor, Titulo, Año_Publicacion) VALUES 
	(1, 'Don Quijote de la Mancha', 1605),
	(2, 'Cien años de soledad', 1967),
	(3, 'La casa de los espíritus', 1982),
	(4, 'El Aleph', 1949),
	(5, 'Rayuela', 1963),
	(6, 'La ciudad y los perros', 1963),
	(7, 'Bodas de sangre', 1933),
	(8, 'Vientos de cambio', 2024), 
	(9, 'Manuscrito Perdido', NULL), 
	(10, 'Aura', 1962);

-- Inserción de 10 préstamos
INSERT INTO Prestamos (ID_Libro, Fecha_Prestamo, Fecha_Devolucion) VALUES 
	(1, '2025-11-10', '2025-11-20'),
	(2, '2025-11-12', '2025-11-22'),
	(3, '2025-11-15', NULL),
	(4, '2025-11-18', '2025-11-28'),
	(5, '2025-11-20', '2025-11-30'),
	(6, '2025-12-01', '2025-12-10'),
	(7, '2025-12-05', NULL),
	(8, '2025-12-08', '2025-12-18'),
	(9, '2025-12-10', '2025-12-20'),
	(10, '2025-12-12', NULL);

-- Listar todos los libros publicados después del año 2000
SELECT * FROM Libros 
WHERE Año_Publicacion > 2000;

-- Mostrar todos los préstamos que aún no se han devuelto (según fecha actual)
SELECT * FROM Prestamos 
WHERE Fecha_Devolucion IS NULL;

-- Listar los libros junto con los nombres de sus autores
SELECT L.Titulo AS Libro, A.Nombre, A.Apellido
FROM Libros L
JOIN Autores A ON L.ID_Autor = A.ID_Autor;