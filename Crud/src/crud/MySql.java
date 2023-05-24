
package crud;
import java.sql.*;
import javax.swing.JOptionPane;


public class MySql {
    boolean band;
    Sql s;
    String user;
    String pass;
   
    
    
    public void Conectar(String user, String pass){
        
       Sql s=new Sql();
        
   if(s.Conexion(user, pass)==true)
   {
   
         JOptionPane.showMessageDialog(null, "Bienvenido  "+user);
   
   }
        
   else
   {
   
         JOptionPane.showMessageDialog(null, "Usuario o contraseña erroneos, intenta de nuevo");
   
   }
        
    }
}

