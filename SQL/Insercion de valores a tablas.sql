INSERT INTO TPais (nPaisID, cNombre) VALUES
(724, 'España'),
(840, 'Estados Unidos'),
(250, 'Francia'),
(276, 'Alemania'),
(380, 'Italia'),
(826, 'Reino Unido'),
(392, 'Japón'),
(156, 'China'),
(76, 'Brasil'),
(124, 'Canadá');

INSERT INTO TEditorial (cNombre, nPaisID) VALUES
('Planeta', 724),
('Anagrama', 724),
('Penguin Random House', 840),
('Gallimard', 250),
('Mondadori', 380),
('HarperCollins', 840),
('Oxford Press', 826),
('Kodansha', 392),
('Companhia das Letras', 76),
('McGraw-Hill', 840);

INSERT INTO TSocio (cNIF, cnombre, cApellidos, cDireccion, cTelefono, dAlta, cEmail, Nacimiento) VALUES
('12345678A', 'Ana', 'García López', 'Calle Mayor 1, Madrid', '600123456789', '2020-01-15', 'ana.garcia@example.com', '1990-05-12'),
('23456789B', 'Luis', 'Martínez Ruiz', 'Av. América 45, Madrid', '600234567890', '2021-03-10', 'luis.martinez@example.com', '1985-03-22'),
('34567890C', 'Marta', 'Sánchez Díaz', 'Calle Sol 33, Madrid', '600345678901', '2022-06-01', 'marta.sanchez@example.com', '1992-07-08'),
('45678901D', 'Carlos', 'Pérez Gómez', 'Calle Luna 12, Madrid', '600456789012', '2023-02-20', 'carlos.perez@example.com', '1988-11-30'),
('56789012E', 'Lucía', 'Fernández Gil', 'Calle Real 5, Madrid', '600567890123', '2021-09-10', 'lucia.fernandez@example.com', '1995-09-14'),
('67890123F', 'Javier', 'Romero Torres', 'Calle Norte 8, Madrid', '600678901234', '2020-12-12', 'javier.romero@example.com', '1991-01-01'),
('78901234G', 'Elena', 'Navarro Cruz', 'Calle Sur 9, Madrid', '600789012345', '2022-04-04', 'elena.navarro@example.com', '1993-04-25'),
('89012345H', 'David', 'Serrano León', 'Calle Este 7, Madrid', '600890123456', '2023-01-01', 'david.serrano@example.com', '1989-06-18'),
('90123456I', 'Sara', 'Molina Ríos', 'Calle Oeste 3, Madrid', '600901234567', '2023-07-07', 'sara.molina@example.com', '1996-08-09'),
('01234567J', 'Pablo', 'Iglesias Vera', 'Calle Central 10, Madrid', '600012345678', '2024-05-05', 'pablo.iglesias@example.com', '1994-10-10');

INSERT INTO TLibro (nLibroID, cTitulo, dAnyoPublicacion, nEditorialID) VALUES
(1, 'El Quijote', '2005-01-01', 1),
(2, 'Cien Años', '2006-02-15', 2),
(3, '1984', '2007-03-20', 3),
(4, 'Crimen y Castigo', '2008-04-10', 4),
(5, 'Orgullo', '2009-05-05', 5),
(6, 'Ulises', '2010-06-06', 6),
(7, 'Kafka', '2011-07-07', 7),
(8, 'Tokio Blues', '2012-08-08', 8),
(9, 'Dom Casmurro', '2013-09-09', 9),
(10, 'Educated', '2014-10-10', 10);

INSERT INTO TEjemplar (cSignatura, nLibroID) VALUES
('EJ001', 1),
('EJ002', 2),
('EJ003', 3),
('EJ004', 4),
('EJ005', 5),
('EJ006', 6),
('EJ007', 7),
('EJ008', 8),
('EJ009', 9),
('EJ010', 10);

INSERT INTO TPrestamo (cSignatura, cNIF, dPrestamo) VALUES
('EJ001', '12345678A', '2023-01-01'),
('EJ002', '23456789B', '2023-01-02'),
('EJ003', '34567890C', '2023-01-03'),
('EJ004', '45678901D', '2023-01-04'),
('EJ005', '56789012E', '2023-01-05'),
('EJ006', '67890123F', '2023-01-06'),
('EJ007', '78901234G', '2023-01-07'),
('EJ008', '89012345H', '2023-01-08'),
('EJ009', '90123456I', '2023-01-09'),
('EJ010', '01234567J', '2023-01-10');

INSERT INTO TTema (nTemaID, cNombre) VALUES
(1, 'Historia'),
(2, 'Ficción'),
(3, 'Ciencia'),
(4, 'Arte'),
(5, 'Filosofía'),
(6, 'Tecnología'),
(7, 'Viajes'),
(8, 'Psicología'),
(9, 'Educación'),
(10, 'Misterio');

INSERT INTO TLibroTema (nLibroID, nTemaID) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 5),
(5, 2),
(6, 5),
(7, 3),
(8, 7),
(9, 1),
(10, 9);

INSERT INTO TAutor (nAutorID, cNombre, cApellidos) VALUES
(1, 'Miguel', 'Cervantes'),
(2, 'Gabriel', 'García Márquez'),
(3, 'George', 'Orwell'),
(4, 'Fiódor', 'Dostoyevski'),
(5, 'Jane', 'Austen'),
(6, 'James', 'Joyce'),
(7, 'Franz', 'Kafka'),
(8, 'Haruki', 'Murakami'),
(9, 'Machado', 'Assis'),
(10, 'Tara', 'Westover');

INSERT INTO TLibroAutor (nLibroID, nAutorID) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

INSERT INTO TAutorPais (nAutorID, nPaisID) VALUES
(1, 724),
(2, 724),
(3, 840),
(4, 392),
(5, 826),
(6, 380),
(7, 276),
(8, 392),
(9, 76),
(10, 840);

