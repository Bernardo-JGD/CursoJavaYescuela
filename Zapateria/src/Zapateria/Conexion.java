
package Zapateria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection getConnection (){
        
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=Zapateria_2;"
                + "user=sa;"
                + "password=gD11jB@10_99;"
                + "loginTimeout=30;";
        
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            
            return con;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            System.out.println("Aqui");
            return null;
        }
        
    }
    
}
