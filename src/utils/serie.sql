/*USE redflix;*/
CREATE TABLE serie(
ser_id integer AUTO_INCREMENT PRIMARY KEY,
ser_episodios INT,
ser_temporadas INT,
FOREIGN  KEY(ser_id)REFERENCES  contenido(con_id)
);
/*Insertar Series*/
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (6,153,11);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (7,80,3);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (8,30,3);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (9,31,4);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (10,236,10);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (11,170,8);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (12,279,12);
INSERT INTO serie(ser_id,ser_episodios,ser_temporadas) VALUES (13,79,6);