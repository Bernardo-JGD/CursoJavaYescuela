
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/DatosPaises";
    public static final String usuario = "root";
    public static final String contra = "1z6_9@bR83tD";
    
    public Connection getConnection (){
        Connection conexion = null;
        
        try{
            //Viejo: com.mysql.jdbc.Driver
            //Nuevo : com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contra);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa :D!!!");
        }catch (Exception ex){
            System.err.println("Error: " + ex);
            //JOptionPane.showMessageDialog(null, "Conexión Fallida D:!!!");
        }
        return conexion;
    }
    
}
