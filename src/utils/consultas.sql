/*USE redflix;*/
/*Mostrar la información del título de todas las películas y series ordenadas alfabéticamente*/
SELECT 'Consula1';
SELECT con_titulo FROM contenido ORDER BY con_titulo ASC;
/*Mostrar la información de las películas (título, resumen, año) que se han estrenado posteriormente al año 2000, ordenadas por título*/
SELECT 'Consulta2';
SELECT con_titulo,pel_resumen,pel_anio FROM contenido JOIN pelicula ON contenido.con_id = pelicula.pel_id WHERE pel_Anio > 2000 ORDER BY con_titulo ASC;
/*Mostrar los títulos de películas dirigidas por el director Vincent Ward*/
SELECT 'Consulta3';
SELECT con_titulo FROM contenido JOIN pelicula ON contenido.con_id  = pelicula.pel_id WHERE pel_director = 105;
/*Mostrar la información de las series y películas ( solo los títulos) que ha visto un usuario con alias "lucky", ordenadas por título*/
SELECT 'Consulta4';
SELECT con_titulo FROM contenido JOIN transmision ON contenido.con_id  = transmision.tra_con WHERE tra_user LIKE '%lucky' ORDER BY con_titulo ASC;
/*Mostrar la información de los usuarios (alias y nombre y apellidos) que han visto la película "Interestelar" ordenados alfabéticamente*/
SELECT 'Consulta5';
SELECT tra_user, usr_nombre, usr_apellido FROM usuario JOIN transmision ON usuario.usr_login  = transmision.tra_user WHERE tra_con = 2 ORDER BY usr_login ASC;
/*Mostrar cuantas películas se han estrenado después del año 2000*/
SELECT 'Consulta6';
SELECT count(pel_anio) AS cantidad_peliculas FROM pelicula WHERE pel_anio > 2000;