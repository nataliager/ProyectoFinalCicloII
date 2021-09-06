/**
 * Clase PeliculaModel.java 
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 * Explicacion: Objeto PeliculaModel, contiene los atributos y los metodos
 * get y set que se van a utilizar para obtencion y almacenar datos relacionados con la BD.
 */
package model;

public class PeliculaModel {

    private int contenidoId;
    private String contenidoTitulo;
    private String contenidoDirector;
    private int contenidoAnio;
    private String contenidoCategoria;
    private int contenidoTemporadas;
    private int contenidoCapitulo;

    /**
     * Contructor para serie con ID
     * @param contenidoId
     * @param contenidoTitulo
     * @param contenidoDirector
     * @param contenidoAnio
     * @param contenidoCategoria
     * @param contenidoTemporadas
     * @param contenidoCapitulo
     * 
     */
    public PeliculaModel(int contenidoId, String contenidoTitulo, String contenidoDirector,
            int contenidoAnio, String contenidoCategoria, int contenidoTemporadas, int contenidoCapitulo) {
        this.contenidoId = contenidoId;
        this.contenidoTitulo = contenidoTitulo;
        this.contenidoDirector = contenidoDirector;
        this.contenidoAnio = contenidoAnio;
        this.contenidoCategoria = contenidoCategoria;
        this.contenidoTemporadas = contenidoTemporadas;
        this.contenidoCapitulo = contenidoCapitulo;
    }

    /**
     * Contructor para serie sin ID
     * @param contenidoTitulo
     * @param contenidoDirector
     * @param contenidoAnio
     * @param contenidoCategoria
     * @param contenidoTemporadas
     * @param contenidoCapitulo
     * 
     */
    public PeliculaModel(String contenidoTitulo, String contenidoDirector, int contenidoAnio, String contenidoCategoria, int contenidoTemporadas, int contenidoCapitulo) {
        this.contenidoTitulo = contenidoTitulo;
        this.contenidoDirector = contenidoDirector;
        this.contenidoAnio = contenidoAnio;
        this.contenidoCategoria = contenidoCategoria;
        this.contenidoTemporadas = contenidoTemporadas;
        this.contenidoCapitulo = contenidoCapitulo;
    }

    /**
     * Contructor para pelicula sin ID
     * @param contenidoTitulo
     * @param contenidoDirector
     * @param contenidoAnio
     * @param contenidoCategoria
     * 
     */
    public PeliculaModel(String contenidoTitulo, String contenidoDirector, int contenidoAnio, String contenidoCategoria) {
        this.contenidoTitulo = contenidoTitulo;
        this.contenidoDirector = contenidoDirector;
        this.contenidoAnio = contenidoAnio;
        this.contenidoCategoria = contenidoCategoria;
    }

    /**
     * Contructor para actualizar serie con ID
     * @param contenidoId
     * @param contenidoTitulo
     * @param contenidoDirector
     * @param contenidoTemporadas
     * @param contenidoCapitulo
     * 
     */
    public PeliculaModel(int contenidoId, String contenidoTitulo, String contenidoDirector, int contenidoTemporadas, int contenidoCapitulo) {
        this.contenidoId = contenidoId;
        this.contenidoTitulo = contenidoTitulo;
        this.contenidoDirector = contenidoDirector;
        this.contenidoTemporadas = contenidoTemporadas;
        this.contenidoCapitulo = contenidoCapitulo;
    }

    /**
     * Contructor para actualizar pelicula
     * @param contenidoId
     * @param contenidoTitulo
     * @param contenidoDirector
     * 
     */
    public PeliculaModel(int contenidoId, String contenidoTitulo, String contenidoDirector) {
        this.contenidoId = contenidoId;
        this.contenidoTitulo = contenidoTitulo;
        this.contenidoDirector = contenidoDirector;
    }
    
    

    /**
     * @return the contenidoId
     */
    public int getContenidoId() {
        return contenidoId;
    }

    /**
     * @return the contenidoTitulo
     */
    public String getContenidoTitulo() {
        return contenidoTitulo;
    }

    /**
     * @param contenidoTitulo the contenidoTitulo to set
     */
    public void setContenidoTitulo(String contenidoTitulo) {
        this.contenidoTitulo = contenidoTitulo;
    }

    /**
     * @return the contenidoDirector
     */
    public String getContenidoDirector() {
        return contenidoDirector;
    }

    /**
     * @param contenidoDirector the contenidoDirector to set
     */
    public void setContenidoDirector(String contenidoDirector) {
        this.contenidoDirector = contenidoDirector;
    }

    /**
     * @return the contenidoAnio
     */
    public int getContenidoAnio() {
        return contenidoAnio;
    }

    /**
     * @param contenidoAnio the contenidoAnio to set
     */
    public void setContenidoAnio(int contenidoAnio) {
        this.contenidoAnio = contenidoAnio;
    }

    /**
     * @return the contenidoCategoria
     */
    public String getContenidoCategoria() {
        return contenidoCategoria;
    }

    /**
     * @param contenidoCategoria the contenidoCategoria to set
     */
    public void setContenidoCategoria(String contenidoCategoria) {
        this.contenidoCategoria = contenidoCategoria;
    }

    /**
     * @return the contenidoTemporadas
     */
    public int getContenidoTemporadas() {
        return contenidoTemporadas;
    }

    /**
     * @param contenidoTemporadas the contenidoTemporadas to set
     */
    public void setContenidoTemporadas(int contenidoTemporadas) {
        this.contenidoTemporadas = contenidoTemporadas;
    }

    /**
     * @return the contenidoCapitulo
     */
    public int getContenidoCapitulo() {
        return contenidoCapitulo;
    }

    /**
     * @param contenidoCapitulo the contenidoCapitulo to set
     */
    public void setContenidoCapitulo(int contenidoCapitulo) {
        this.contenidoCapitulo = contenidoCapitulo;
    }

}
