/*USE redflix;*/
/*Cambiar año de la pelicula "Los vengadores" por 2012*/
UPDATE pelicula SET pel_anio = 2012 WHERE pel_id = 1;
/*Cambiar el telefono del usuario "ninja" por 3115678432*/
UPDATE usuario SET usr_celular = 3115678432 WHERE usr_login = 'ninja';
/*Borrar la transmisión del usuario "green" de la pelicula "Parasitos"*/
DELETE FROM transmision WHERE tra_con = 4 and tra_user = 'green';