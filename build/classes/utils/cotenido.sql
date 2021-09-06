/*USE redflix;*/
CREATE TABLE contenido(
	con_id				integer AUTO_INCREMENT PRIMARY KEY,
	con_titulo			CHAR(50) 	NOT NULL
);
/*Peliculas*/
INSERT INTO contenido(con_titulo) VALUES ('Los Vengadores');
INSERT INTO contenido(con_titulo) VALUES ('Interestelar');
INSERT INTO contenido(con_titulo) VALUES ('El viaje de Chihiro');
INSERT INTO contenido(con_titulo) VALUES ('Parasitos');
INSERT INTO contenido(con_titulo) VALUES ('Mas alla de los sueños');
/*Series*/
INSERT INTO contenido(con_titulo) VALUES ('The walking dead');
INSERT INTO contenido(con_titulo) VALUES ('Viaje a las estrellas: la serie original');
INSERT INTO contenido(con_titulo) VALUES ('Glow');
INSERT INTO contenido(con_titulo) VALUES ('La casa de papel');
INSERT INTO contenido(con_titulo) VALUES ('Friends');
INSERT INTO contenido(con_titulo) VALUES ('Arrow');
INSERT INTO contenido(con_titulo) VALUES ('The big bang theory');
INSERT INTO contenido(con_titulo) VALUES ('Vikingos');