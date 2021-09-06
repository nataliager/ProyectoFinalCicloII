/**
 * Clase MovieController.java
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 *
 */
package controllers;

//Paquetes
import access.PeliculaDAO;
import java.util.ArrayList;
import model.PeliculaModel;


public class MovieController {

    //Intermediario entre el DAO y la vista, donde tyo utilice esta funcion 
    public void saveContenido(PeliculaModel pelicula) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.agregarContenido(pelicula);
    }

    //Intermediarios para los updates
    public void updateContenidoSerie(PeliculaModel pelicula) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.updateSerie(pelicula);
    }

    public void updateContenidoPelicula(PeliculaModel pelicula) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.updatePelicula(pelicula);
    }

    //Intermediario para el delete
    public void deleteContenido(Integer id) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.deleteContenido(id);
    }

    //Intermediario para read contenido
    public ArrayList<PeliculaModel> getContenido() {
        PeliculaDAO peliculadao = new PeliculaDAO();
        return peliculadao.getAllContenidos();
    }
    
    public PeliculaModel getContenidoTitulo(String titulo) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        return peliculadao.getContenidoByTitulo(titulo);
    }
    
    public PeliculaModel getContenidoId(Integer id) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        return peliculadao.getContenidoById(id);
    }

}
