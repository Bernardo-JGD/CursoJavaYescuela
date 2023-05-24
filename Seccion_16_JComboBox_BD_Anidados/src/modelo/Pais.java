
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class Pais {
    
    private int idPais;
    private String nombre;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
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
    
    public Vector <Pais> mostrarPaises (){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector <Pais> VectorPaises = new Vector <Pais> ();
        Pais pais = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("SELECT * FROM Paises");
            rs = ps.executeQuery();
            
            pais = new Pais ();
            pais.setIdPais(0);
            pais.setNombre("Seleccione Pais");
            VectorPaises.add(pais);
            
            while (rs.next()){
                
                pais = new Pais();
                pais.setIdPais(rs.getInt("idPais"));
                pais.setNombre(rs.getString("nombre_pais"));
                VectorPaises.add(pais);
            }
            
            rs.close();
            
        }catch (Exception ex ){
            System.err.println("Error: " + ex);
        }
        
        return VectorPaises;
        
    }
    
}
