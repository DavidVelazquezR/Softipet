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
	RFC VARCHAR(13) NOT NULL,
	PRIMARY KEY(Id_proveedor)
);

CREATE TABLE MEDICAMENTOS(
	Id_medicamento INT(10) AUTO_INCREMENT,
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

CREATE TABLE BODEGA(
	Id_historial INT(10) AUTO_INCREMENT,
	Id_empleado INT(10) NOT NULL,
	Id_medicamento INT(10) NOT NULL,
	Cantidad INT(10) NOT NULL,
	Nombre_trabajador VARCHAR(30) NOT NULL,
	AP_trabajador VARCHAR(30) NOT NULL,
	AM_trabajador VARCHAR(30) NOT NULL,
	Fecha_entrega DATE,
	Hora_entrega TIME,
	PRIMARY KEY(Id_historial),
	FOREIGN KEY(Id_medicamento) REFERENCES MEDICAMENTOS(Id_medicamento),
	FOREIGN KEY(Id_empleado) REFERENCES USUARIOS(Id_empleado)
);

CREATE TABLE RECETA(
	Folio INT(10) AUTO_INCREMENT,
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

CREATE TABLE PERDIDAS(
	Id_perdida INT(10) AUTO_INCREMENT,
	Id_medicamento INT(10),
	Cantidad INT(10),
	Total FLOAT,
	FechaRetiro DATE,
	PRIMARY KEY (Id_perdida),
	FOREIGN KEY (Id_medicamento) REFERENCES MEDICAMENTOS (Id_medicamento)
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
	"proveedor@pro.com",
	"1234567890123"
);

INSERT INTO MEDICAMENTOS VALUES(
	1,
	"Paracetamol",
	"Acertar",
	"6 Tabletas Oral Caja",
	"Farmacon",
	"2020-10-12",
	1,
	"AE-35",
	20.0,
	30.0,
	50
);

INSERT INTO MEDICAMENTOS VALUES(
	2,
	"Omeprazol",
	"Arapride",
	"Tableta 12mg Oral Caja",
	"AstraZeneca",
	"2020-11-20",
	1,
	"AE-36",
	45.00,
	60.00,
	50
);

INSERT INTO BODEGA VALUES(
	1,
	1,
	1,
	50,
	"Roberto",
	"Cruz",
	"Perez",
	"2020-10-10",
	"12:05:06"
);

INSERT INTO BODEGA VALUES(
	2,
	1,
	2,
	50,
	"Roberto",
	"Cruz",
	"Perez",
	"2020-10-10",
	"12:15:06"
);