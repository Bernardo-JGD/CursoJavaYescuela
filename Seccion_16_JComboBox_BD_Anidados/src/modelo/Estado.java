
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;


public class Estado {
    
    private int idEstado;
    private String nombre;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
    
    public Vector <Estado> mostrarEstados (Integer idPais){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Vector <Estado> VectorEstado = new Vector <Estado> ();
        Estado estado = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("SELECT * FROM Estado WHERE idPais = " + idPais);
            rs = ps.executeQuery();
            
            estado = new Estado ();
            estado.setIdEstado(0);
            estado.setNombre("Seleccione Estado");
            VectorEstado.add(estado);
            
            while (rs.next()){
                
                estado = new Estado();
                estado.setIdEstado(rs.getInt("idEstado"));
                estado.setNombre(rs.getString("nombre"));
                VectorEstado.add(estado);
            }
            
            rs.close();
            
        }catch (Exception ex ){
            System.err.println("Error: " + ex);
        }
        
        return VectorEstado;
        
    }
    
}
