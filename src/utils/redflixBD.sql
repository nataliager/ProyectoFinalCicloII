CREATE SCHEMA redflix;
USE  redflix;
DROP TABLE IF EXISTS Contenido;
CREATE  TABLE  Contenido(
    contenidoId   int AUTO_INCREMENT PRIMARY KEY,
    contenidoTitulo varchar(40) NOT NULL,
	contenidoDirector varchar(50) NOT NULL,
    contenidoAnio int NOT NULL,
    contenidoCategoria ENUM('Romance','Ciencia Ficción', 'Terror','Comedia','Drama','Acción') DEFAULT 'Romance',
	contenidoTemporadas int,
    contenidoCapitulo int
    );
    
INSERT  INTO  Contenido(contenidoTitulo, contenidoDirector, contenidoAnio, contenidoCategoria) 
VALUES('Los Vengadores','Hayo Miyazaki',2014,'Acción');
INSERT  INTO  Contenido(contenidoTitulo, contenidoDirector, contenidoAnio, contenidoCategoria) 
VALUES('Interestelar','Joss Whedon',2000,'Acción');
INSERT  INTO  Contenido(contenidoTitulo, contenidoDirector, contenidoAnio, contenidoCategoria,contenidoTemporadas,contenidoCapitulo) 
VALUES('The walking dead','Bong Joon-ho',2015,'Ciencia Ficción',10,390);