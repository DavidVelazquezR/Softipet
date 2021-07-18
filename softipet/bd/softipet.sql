DROP DATABASE softipet;
CREATE DATABASE softipet;
USE softipet;

CREATE TABLE Roles(Id_rol INT, 
				   rol VARCHAR(20),
				   PRIMARY KEY (Id_rol));

CREATE TABLE USUARIOS(Id_empleado INT(10) NOT NULL AUTO_INCREMENT,
					  Nombre VARCHAR(30) NOT NULL,
					  Apellido_paterno VARCHAR(30) NOT NULL,
					  Apellido_materno VARCHAR(30) NOT NULL,
					  Telefono VARCHAR(10) NOT NULL,
					  Email VARCHAR(30) NOT NULL,
					  Contrasenia VARCHAR(30) NOT NULL,
					  CURP VARCHAR(16)NOT NULL,
					  Sexo VARCHAR(16)NOT NULL,
					  Fecha_nacimiento DATE,
					  Direccion VARCHAR(180) NOT NULL,
					  Id_rol INT,
					  PRIMARY KEY (Id_empleado),
					  FOREIGN KEY (ID_rol) REFERENCES Roles(Id_rol),
					  UNIQUE(CURP, Email));

CREATE TABLE MEDICOS(Id_medico INT(10) NOT NULL,
					 Cedula VARCHAR(16) NOT NULL,
					 Especialidad VARCHAR(60) NOT NULL,
					 Fac_egreso VARCHAR(60) NOT NULL,
					 FOREIGN KEY(Id_medico) REFERENCES USUARIOS(Id_empleado));

CREATE TABLE MEDICAMENTOS(Id_medicamento INT,
						  Nombre_generico VARCHAR(60) NOT NULL,
						  Nombre_comercial VARCHAR(60) NOT NULL,
						  Contenido VARCHAR(30) NOT NULL,
						  Via_admin VARCHAR(30) NOT NULL,
						  Recipiente VARCHAR(30) NOT NULL,
						  Laboratorio VARCHAR(180) NOT NULL,
						  Caducidad DATE,
						  Lote VARCHAR(15) NOT NULL,
						  Stock VARCHAR(15),
						  Precio_fabricante DECIMAL(5, 2) NOT NULL,
						  Precio_publico DECIMAL(5, 2) NOT NULL,
						  Existencia DECIMAL(5, 2) NOT NULL,
						  PRIMARY KEY(Id_medicamento));

CREATE TABLE RECETA(Folio INT AUTO_INCREMENT,
					Id_medico INT(10) NOT NULL,
					Nombre_medico VARCHAR(60) NOT NULL,
					Cedula VARCHAR(120) NOT NULL,
					Fecha_consulta DATE,
					Paciente VARCHAR(60) NOT NULL,
					Edad INT NOT NULL,
					Estatura FLOAT NOT NULL,
					Peso FLOAT NOT NULL,
					Temperatura FLOAT,
					Presion FLOAT NOT NULL,
					Alergias VARCHAR(60) DEFAULT "Ninguna",
					Padecimiento TEXT NOT NULL,
					Medicacion TEXT NOT NULL,
					PRIMARY KEY (Folio),
					FOREIGN Key (Id_medico) REFERENCES MEDICOS(Id_medico)	
					);

CREATE TABLE ventas(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	fecha DATETIME NOT NULL,
	total DECIMAL(7,2),
	PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;

CREATE TABLE productos_vendidos(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	Id_medicamento INT,
	cantidad BIGINT UNSIGNED NOT NULL,
	id_venta BIGINT UNSIGNED NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(Id_medicamento) REFERENCES MEDICAMENTOS(Id_medicamento),
	FOREIGN KEY(id_venta) REFERENCES ventas(id) ON DELETE CASCADE
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;


INSERT INTO roles(Id_rol, rol) VALUES(1, "Admin");
INSERT INTO roles(Id_rol, rol) VALUES(2, "Medico");
INSERT INTO roles(Id_rol, rol) VALUES(3, "Auxiliar");

INSERT INTO USUARIOS (Id_empleado,Nombre, Apellido_paterno, Apellido_materno, Telefono, Email, Contrasenia, CURP, Sexo, Fecha_nacimiento, Direccion, Id_rol)
VALUES (1, "Aministrador", "Adminnistradcor", "Adminnistradcor", "7373253", "Admin001@gmail.com", "admin001", "Adminnistradcor", "Masculino", 2020-01-01, "Toluca", 1);



INSERT INTO MEDICAMENTOS(Id_medicamento, Nombre_generico, Nombre_comercial, Contenido, Via_admin, Recipiente, Laboratorio, Caducidad, lote, Stock, Precio_fabricante, Precio_publico, Existencia) 
VALUES(384764, "Paracetamol", "Acertar", "6 Tabletas", "Oral", "caja", "Farmacon", "2022-12-12", "AE-35", "AG", 20.0, 30.0, 100);
INSERT INTO MEDICAMENTOS(Id_medicamento, Nombre_generico, Nombre_comercial, Contenido, Via_admin, Recipiente, Laboratorio, Caducidad, lote, Stock, Precio_fabricante, Precio_publico, Existencia)
VALUES(465312, "Omeprazol", "Arapride", "Tableta 12mg", "Oral", "100 Capsulas", "AstraZeneca", "2023-12-20", "AE-35", "AE", 45.00, 60.00, 100);
INSERT INTO MEDICAMENTOS(Id_medicamento, Nombre_generico, Nombre_comercial, Contenido, Via_admin, Recipiente, Laboratorio, Caducidad, lote, Stock, Precio_fabricante, Precio_publico, Existencia)
VALUES(735345, "Ambroxol", "Ambroxol", "Solucion 7.5 mg/ml", "Oral", "Frasco 30m ml", "Farmacon", "2222-06-22", "AE-35", "RG", 55.45, 70.00, 100);
INSERT INTO MEDICAMENTOS(Id_medicamento, Nombre_generico, Nombre_comercial, Contenido, Via_admin, Recipiente, Laboratorio, Caducidad, lote, Stock, Precio_fabricante, Precio_publico, Existencia)
VALUES(938463, "Naproxeno", "Naxodol", "Capsulas 250 mg ", "Oral", "caja 30 tabletas", "Seigfred", "2024-10-12", "AE-37", "AR", 25.50, 35.00, 100);
INSERT INTO MEDICAMENTOS(Id_medicamento, Nombre_generico, Nombre_comercial, Contenido, Via_admin, Recipiente, Laboratorio, Caducidad, lote, Stock, Precio_fabricante, Precio_publico, Existencia)
VALUES(937422, "Hidrocortisona", "Acertar", "Crema", "Topica", "Tubo 60 ml", "Galderma", "2023-02-14", "RE-35", "UT", 75.00, 92.75, 100);
