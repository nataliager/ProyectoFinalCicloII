/*
 * Clase ConnectionDB.java
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 * and open the template in the editor.
 */
package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author casierrav
 */
public class ConnectionDB {
    
    /**
     * 
     * @return 
     */
    public static Connection getConnection() {
        
        JSONParser parser = new JSONParser();
        Connection conn = null;
        // conectar
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/utils/db_credentials.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            
            String host     = (String)jsonObject.get("db_ip");
            String port     = (String)jsonObject.get("dp_port");
            String username = (String)jsonObject.get("db_user");
            String password = (String)jsonObject.get("db_pssword");
            String dbURL = "jdbc:mysql://"+host+":"+port+"/redflix" ;
            
            conn = DriverManager.getConnection(dbURL, username, password);
            //if( conn != null ) 
               //System.out.println ( "Conecta  do" );
        } 
        catch( SQLException | FileNotFoundException ex ) {
            ex.printStackTrace();
        } 
        catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
    
     public static void main(String[] args){
        getConnection();
    }
    
}
