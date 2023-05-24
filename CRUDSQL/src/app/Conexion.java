package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    
    public static Connection getConnection (){
        
        String url = "jdbc:sqlserver://localhost:1433;" 
                + "database=escuela;"
                + "user=sa;"
                + "password=gD11jB@10_99;";
        
        try{
            
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
    }
    
}
