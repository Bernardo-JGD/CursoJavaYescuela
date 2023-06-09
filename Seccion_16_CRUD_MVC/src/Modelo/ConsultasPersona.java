package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultasPersona extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Persona persona) {

        Connection conexion = getConnection();

        try {

            ps = conexion.prepareStatement("INSERT INTO Persona (clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) VALUES (?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreo_electronico());
            ps.setDate(6, persona.getFecha_nacimiento());
            ps.setString(7, persona.getGenero());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }
        }

    }
    
    public boolean buscar (Persona persona){
        
        Connection conexion = getConnection();
        
        try{
            
            ps = conexion.prepareStatement("SELECT * FROM Persona WHERE clave = ?");
            ps.setString(1, persona.getClave());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreo_electronico(rs.getString("correo_electronico"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
            }else{
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch (Exception ex){
                System.err.println("Error: " + ex);
            }
        }
        
    }
    
    public boolean modifcar (Persona persona){
        
        Connection conexion = getConnection();
        
        try{
            
            ps = conexion.prepareStatement("UPDATE Persona SET clave=?, nombre=?, domicilio=?, celular=?, correo_electronico=?, fecha_nacimiento=?, genero=? WHERE idPersona=?");
            ps.setString(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreo_electronico());
            ps.setDate(6, persona.getFecha_nacimiento());
            ps.setString(7, persona.getGenero());
            ps.setInt(8, persona.getIdPersona());
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0) {
                return true;
            }else{
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch (Exception ex){
                System.err.println("Error: " + ex);
            }
        }
        
    }
    
    public boolean eliminar (Persona persona){
        
        Connection conexion = getConnection();
        
        try{
            ps = conexion.prepareStatement("DELETE FROM Persona WHERE idPersona=?");
            
            ps.setInt(1, persona.getIdPersona());
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0) {
                return true;
            }else{
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch (Exception ex){
                System.err.println("Error");
            }
                
        }
        
    }

}
