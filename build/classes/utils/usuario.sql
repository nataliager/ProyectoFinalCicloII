/*USE redflix;*/
CREATE TABLE usuario(
usr_login VARCHAR(20) PRIMARY KEY NOT NULL,
usr_nombre VARCHAR(20),
usr_apellido VARCHAR(20),
usr_email VARCHAR(30),
usr_celular BIGINT,
usr_clave VARCHAR(20),
usr_fecha_nto DATE
);
/*Insertar usuarios*/
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('lucky','Pedro','Perez');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('malopez','Maria','Lopez');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('diva','Ana','Diaz');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('dreamer','Luis','Rojas');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('ninja','Andres','Cruz');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('neon','Nelson','Ruiz');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('rose','Claudia','Mendez');
INSERT INTO usuario(usr_login,usr_nombre,usr_apellido) VALUES ('green','Jorge','Rodriguez');