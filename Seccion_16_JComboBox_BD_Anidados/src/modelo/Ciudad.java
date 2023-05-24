
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class Ciudad {
    
    private int idCiudad;
    private String nombre;

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString (){
        return this.nombre;
    }
    
    public Vector <Ciudad> mostrarCiudad (Integer idEstado){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector <Ciudad> VectorCiudad = new Vector <Ciudad> ();
        Ciudad ciudad = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("SELECT * FROM Ciudad WHERE idEstado = " + idEstado);
            rs = ps.executeQuery();
            
            ciudad = new Ciudad ();
            ciudad.setIdCiudad(0);
            ciudad.setNombre("Seleccione Ciudad");
            VectorCiudad.add(ciudad);
            
            while (rs.next()){
                
                ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                VectorCiudad.add(ciudad);
            }
            
            rs.close();
            
        }catch (Exception ex ){
            System.err.println("Error: " + ex);
        }
        
        return VectorCiudad;
        
    }
    
}
