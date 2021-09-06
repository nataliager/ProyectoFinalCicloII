/*USE redflix;*/
CREATE TABLE pelicula(
pel_id 	integer AUTO_INCREMENT PRIMARY KEY,
pel_resumen VARCHAR(250),
pel_Anio INT,
pel_director INT,
FOREIGN  KEY(pel_id)REFERENCES  contenido(con_id),
FOREIGN  KEY(pel_director)REFERENCES  director(dir_id)
);
/*Insertar peliculas*/
INSERT INTO pelicula(pel_resumen,pel_Anio,pel_director) VALUES ('Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.', 1990, 101);
INSERT INTO pelicula(pel_resumen,pel_Anio,pel_director) VALUES ('Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.',2014,103);
INSERT INTO pelicula(pel_resumen,pel_Anio,pel_director) VALUES ('Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.',2001,101);
INSERT INTO pelicula(pel_resumen,pel_Anio,pel_director) VALUES ('Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.',2019,104);
INSERT INTO pelicula(pel_resumen,pel_Anio,pel_director) VALUES ('Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.',1998,105);
