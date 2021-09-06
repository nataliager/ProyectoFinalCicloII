/*USE redflix;*/
CREATE TABLE transmision(
tra_id integer AUTO_INCREMENT PRIMARY KEY,
tra_user VARCHAR(40),
tra_con INT,
tra_fecha DATETIME,
FOREIGN  KEY(tra_user)REFERENCES  usuario(usr_login),
FOREIGN  KEY(tra_con)REFERENCES  contenido(con_id)
);
/*Insertar Transmisiones*/
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('lucky',1,'2017-10-25 20:00:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('lucky',4,'2019-03-15 18:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('lucky',9,'2019-05-20 20:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('malopez',1,'2018-05-20 20:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('malopez',9,'2020-01-20 20:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('diva',2,'2019-05-20 20:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('diva',3,'2018-06-22 21:30:00');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('diva',6,'2020-03-17 15:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('dreamer',6,'2020-03-17 15:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('dreamer',7,'2020-04-10 18:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('ninja',8,'2020-02-17 20:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('ninja',9,'2020-02-20 16:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('ninja',11,'2020-03-27 18:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('rose',10, '2020-03-20 21:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('green',2, '2020-01-10 17:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('green',4, '2020-02-15 20:30:20');
INSERT INTO transmision(tra_user,tra_con,tra_fecha) VALUES ('green',5, '2020-03-17 18:30:20');