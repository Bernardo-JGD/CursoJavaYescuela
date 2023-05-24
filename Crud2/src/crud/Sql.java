
package crud;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author oende
 */
public class Sql {

    Connection con;
    boolean band = false;

    public boolean Conexion(String usuario, String contraseña) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //                                           localhost   127.0.0.1
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/TAP?" + "user=" + usuario + "&password=" + contraseña  + "&serverTimeZone=UTC");

            if (con.isValid(0)) {
                JOptionPane.showMessageDialog(null, "Conexión Exitosa");

                Statement stmt = con.createStatement();
                band = true;
            } else {
                band = false;
            }
            /*
    if(stmt.execute("select * from usuarios where usuario='"+usuario+"'&contraseña='"+contraseña+"'")){
        return true;
    }else{
      return  false;
    }
 
}

else
{
        JOptionPane.showMessageDialog(null, "Conexión Fallida");
        return false;
  }


    }
    
    catch(Exception e)
            { System.out.println(e);
            return false;
    
    }
             */

        } catch (Exception e) {
            System.out.println(e);

        }
        return band;
    }

}
