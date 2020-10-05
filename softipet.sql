CREATE DATABASE softipet;

USE softipet;

CREATE TABLE USUARIOS(
	Id_empleado INT(10) NOT NULL AUTO_INCREMENT,
	Nombre VARCHAR(30) NOT NULL,
	Apellido_paterno VARCHAR(30) NOT NULL,
	Apellido_materno VARCHAR(30) NOT NULL,
	Telefono VARCHAR(10) NOT NULL,
	Email VARCHAR(30) NOT NULL,
	Contrasenia VARCHAR(30) NOT NULL,
	CURP VARCHAR(18) NOT NULL,
	Sexo VARCHAR(16) NOT NULL,
	Fecha_nacimiento DATE,
	Direccion VARCHAR(180) NOT NULL,
	rol INT,
	PRIMARY KEY (Id_empleado),
	UNIQUE(CURP, Email)
);

CREATE TABLE MEDICOS(
	Folio INT(10) NOT NULL,
	Id_medico INT(10) NOT NULL,
	Cedula VARCHAR(16) NOT NULL,
	Fac_egreso VARCHAR(60) NOT NULL,
	PRIMARY KEY (Folio),
	FOREIGN KEY(Id_medico) REFERENCES USUARIOS(Id_empleado)
);

CREATE TABLE PROVEEDORES(
	Id_proveedor INT(10) NOT NULL AUTO_INCREMENT,
	NombreProveedor VARCHAR(30) NOT NULL,
	Telefono VARCHAR(10) NOT NULL,
	Email VARCHAR(30) NOT NULL,
	PRIMARY KEY(Id_proveedor)
);

CREATE TABLE MEDICAMENTOS(
	Id_medicamento INT,
	Nombre_generico VARCHAR(60) NOT NULL,
	Nombre_comercial VARCHAR(60) NOT NULL,
	Descripcion VARCHAR(50) NOT NULL,
	Marca VARCHAR(30) NOT NULL,
	Caducidad DATE,
	Id_proveedor INT(10),
	Lote VARCHAR(15) NOT NULL,
	Precio_fabricante DECIMAL(5, 2) NOT NULL,
	Precio_publico DECIMAL(5, 2) NOT NULL,
	Existencia INT(10) NOT NULL,
	PRIMARY KEY(Id_medicamento),
	FOREIGN KEY(Id_proveedor) REFERENCES PROVEEDORES(Id_proveedor)
);

CREATE TABLE RECETA(
	Folio INT AUTO_INCREMENT,
	Id_medico INT(10) NOT NULL,
	Nombre_medico VARCHAR(60) NOT NULL,
	Cedula VARCHAR(120) NOT NULL,
	Fecha_consulta DATE,
	Paciente VARCHAR(60) NOT NULL,
	Padecimiento TEXT NOT NULL,
	Medicacion TEXT NOT NULL,
	PRIMARY KEY (Folio),
	FOREIGN KEY (Id_medico) REFERENCES MEDICOS(Id_medico)
);

INSERT INTO USUARIOS VALUES(
	1,
	"ADMIN",
	"ADMIN",
	"ADMIN",
	"1234567890",
	"admin@gmail.com",
	"admin",
	"123456789012345678",
	"Masculino",
	"2020-01-01",
	"Unknown",
	1
);

INSERT INTO PROVEEDORES VALUES(
	1,
	"ProveedorTest",
	"1234567890",
	"proveedor@pro.com"
);

INSERT INTO MEDICAMENTOS VALUES(
	1,
	"Paracetamol",
	"Acertar",
	"6 Tabletas Oral Caja",
	"Farmacon",
	"2022-12-12",
	1,
	"AE-35",
	20.0,
	30.0,
	100
);

INSERT INTO MEDICAMENTOS VALUES(
	2,
	"Omeprazol",
	"Arapride",
	"Tableta 12mg Oral Caja",
	"AstraZeneca",
	"2023-12-20",
	1,
	"AE-36",
	45.00,
	60.00,
	100
);