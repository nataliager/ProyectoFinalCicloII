/*USE redflix;*/
CREATE TABLE director(
dir_id INT PRIMARY KEY NOT NULL,
dir_nombre VARCHAR(20),
dir_apellido VARCHAR(20),
dir_nacionalidad VARCHAR(40)
);
insert into director values (101, "Hayo","Miyazaki", "japones");
insert into director values (102, "Joss", "Whedon", "estadounidense");
insert into director values (103, "Christopher", "Nolan", "estadounidense");
insert into director values (104, "Bong", "Joon-ho", "coreano");
insert into director values (105, "Vincent", "Ward", "neozelandes");