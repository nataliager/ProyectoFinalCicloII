/**
 * Clase MovieController.java
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 * Explicacion: Intermediario entre el DAO y la vista, donde se haga uso de los
 * metodos.
 */
package controllers;

//Paquetes
import access.PeliculaDAO;
import java.util.ArrayList;
import model.PeliculaModel;


public class MovieController {
    
    //Intermediario para guardar contenido
    public void saveContenido(PeliculaModel pelicula) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.agregarContenido(pelicula);
    }
    
    //Intermediario para actualizar serie
    public void updateContenidoSerie(PeliculaModel pelicula) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        peliculadao.updateSerie(pelicula);
    }
    
    //Intermediario para actualizar pelicula
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
    
    //Intermediario para buscar contenido por titulo
    public PeliculaModel getContenidoTitulo(String titulo) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        return peliculadao.getContenidoByTitulo(titulo);
    }
    
    //Intermediario para buscar contenido por ID
    public PeliculaModel getContenidoId(Integer id) {
        PeliculaDAO peliculadao = new PeliculaDAO();
        return peliculadao.getContenidoById(id);
    }

}
