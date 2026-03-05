drop database if exists concesionario;
create database concesionario;
use concesionario;

CREATE TABLE Concesionario (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    CIF VARCHAR(15) UNIQUE NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Ubicacion VARCHAR(255),
    Numero_Vehiculos INT DEFAULT 0
);

CREATE TABLE Vehiculo (
    Matricula VARCHAR(15) PRIMARY KEY,
    Marca VARCHAR(50),
    Color VARCHAR(30),
    Potencia INT,
    Precio DECIMAL(10, 2),
    ID_Concesionario INT,
    FOREIGN KEY (ID_Concesionario) REFERENCES Concesionario(ID)
);

INSERT INTO Concesionario (CIF, Nombre, Ubicacion, Numero_Vehiculos) VALUES
('B12345678', 'Motor Sur', 'Calle del Motor 12, Madrid', 2),
('A87654321', 'Norte Coches', 'Avenida de la Industria 45, Bilbao', 2);

INSERT INTO Vehiculo (Matricula, Marca, Color, Potencia, Precio, ID_Concesionario) VALUES
('1234BCF', 'Toyota', 'Rojo', 120, 25000.00, 1),
('5678DGH', 'Ford', 'Azul', 150, 22500.50, 1),
('9012JKL', 'Seat', 'Blanco', 110, 18000.00, 2),
('3456MNP', 'Audi', 'Negro', 200, 45000.00, 2);