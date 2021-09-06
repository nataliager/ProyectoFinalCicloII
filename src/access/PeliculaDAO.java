/**
 * Clase PeliculaDAO.java
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 * 
 */
package access;

//Paquetes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PeliculaModel;
import utils.ConnectionDB;

public class PeliculaDAO {

    private Connection conn = null;

    
    //Agregar contenido 
    public void agregarContenido(PeliculaModel pelicula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "INSERT INTO contenido(contenidoTitulo, contenidoDirector, contenidoAnio,contenidoCategoria,contenidoTemporadas,contenidoCapitulo)"
                    + "VALUES(?, ?, ?, ?, ?, ?)";

            //Insertar los datos 
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pelicula.getContenidoTitulo());//Primer interrogante
            statement.setString(2, pelicula.getContenidoDirector());
            statement.setInt(3, pelicula.getContenidoAnio());
            statement.setString(4, pelicula.getContenidoCategoria());
            statement.setInt(5, pelicula.getContenidoTemporadas());
            statement.setInt(6, pelicula.getContenidoCapitulo());

            int rowsInserted = statement.executeUpdate(); //Ejecuta el query
            if (rowsInserted > 0) {
                System.out.println("Se insertó");
            } else {
                System.out.println("No funcionó");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    //Obtener contenido por ID
    public PeliculaModel getContenidoById(int id) {

        PeliculaModel contenido = null;

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT * FROM contenido WHERE contenidoId =?";

            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            result.next();

            Integer idd = result.getInt(1);
            String titulo = result.getString(2);
            String director = result.getString(3);
            Integer anio = result.getInt(4);
            String categoria = result.getString(5);
            int temporadas = result.getInt(6);
            int capitulos = result.getInt(7);
            contenido = new PeliculaModel(idd, titulo, director, anio, categoria, temporadas, capitulos);
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return contenido;

    }
    
    //Obtener contenido por titulo
    public PeliculaModel getContenidoByTitulo(String titulo) {

        PeliculaModel contenido = null;

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT * FROM contenido WHERE contenidoTitulo =?";

            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            
            statement.setString(1, titulo);
            ResultSet result = statement.executeQuery();
            result.next();

            Integer idd = result.getInt(1);
            String titulo1 = result.getString(2);
            String director = result.getString(3);
            Integer anio = result.getInt(4);
            String categoria = result.getString(5);
            int temporadas = result.getInt(6);
            int capitulos = result.getInt(7);
            contenido = new PeliculaModel(idd, titulo1, director, anio, categoria, temporadas, capitulos);
            conn.close();
            
           
        } catch (SQLException ex) {
            ;
            JOptionPane.showMessageDialog(null, "No se encuentra el contenido: "+titulo);
        }
        return contenido;

    }

    //Filtrar Peliculas
    public ArrayList<PeliculaModel> getAllContenidos() {

        ArrayList<PeliculaModel> contenidos = new ArrayList<>();

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT * FROM contenido";

            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Integer idd = result.getInt(1);
                String titulo = result.getString(2);
                String director = result.getString(3);
                Integer anio = result.getInt(4);
                String categoria = result.getString(5);
                int temporadas = result.getInt(6);
                int capitulos = result.getInt(7);
                PeliculaModel contenido = new PeliculaModel(idd, titulo, director, anio, categoria, temporadas, capitulos);
                contenidos.add(contenido);

            }

            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return contenidos;
    }

    //Actualizar serie
    public void updateSerie(PeliculaModel pelicula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE contenido SET ContenidoTitulo =? ,contenidoDirector =?, contenidoTemporadas =?, contenidoCapitulo =? WHERE contenidoId=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pelicula.getContenidoTitulo());
            statement.setString(2, pelicula.getContenidoDirector());
            statement.setInt(3, pelicula.getContenidoTemporadas());
            statement.setInt(4, pelicula.getContenidoCapitulo());
            statement.setInt(5, pelicula.getContenidoId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    //Actualizar pelicula
    public void updatePelicula(PeliculaModel pelicula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE contenido SET  contenidoTitulo =?, contenidoDirector =? WHERE contenidoId=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pelicula.getContenidoTitulo());
            statement.setString(2, pelicula.getContenidoDirector());
            statement.setInt(3, pelicula.getContenidoId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    //Borrar contenido
    public void deleteContenido(Integer pel_id) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM contenido WHERE contenidoId=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, pel_id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

}
