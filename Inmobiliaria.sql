-- Create Database
CREATE DATABASE IF NOT EXISTS inmobiliaria;

-- Use the Database
USE inmobiliaria;

-- Create Propietario Table
CREATE TABLE IF NOT EXISTS propietario (
    id_propietario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    dni VARCHAR(20) NOT NULL,
    telefono VARCHAR(20),
    domicilio VARCHAR(255),
    estado BOOLEAN NOT NULL
);

-- Create Inquilino Table
CREATE TABLE IF NOT EXISTS inquilino (
    id_inquilino INT PRIMARY KEY AUTO_INCREMENT,
    cuit VARCHAR(20) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    lugar_trabajo VARCHAR(255),
    nombre_garante VARCHAR(255),
    dni_garante VARCHAR(20),
    estado BOOLEAN NOT NULL
);

-- Create Inmueble Table
CREATE TABLE IF NOT EXISTS inmueble (
    id_inmueble INT PRIMARY KEY AUTO_INCREMENT,
    direccion VARCHAR(255) NOT NULL,
    ambientes INT,
    precio DECIMAL(10, 2) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    estado BOOLEAN NOT NULL
);

-- Create Contrato Table
CREATE TABLE IF NOT EXISTS contrato (
    id_contrato INT PRIMARY KEY AUTO_INCREMENT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    monto_total DECIMAL(10, 2) NOT NULL,
    id_inquilino INT,
    id_inmueble INT,
    FOREIGN KEY (id_inquilino) REFERENCES inquilino(id_inquilino),
    FOREIGN KEY (id_inmueble) REFERENCES inmueble(id_inmueble)
);

-- Optionally, add any indexes or additional constraints as needed.

-- Display a message indicating successful execution
SELECT 'Database and Tables Created Successfully' AS 'Message';
