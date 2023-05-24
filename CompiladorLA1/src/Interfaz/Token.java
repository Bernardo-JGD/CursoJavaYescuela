
package Interfaz;

import java.util.regex.Pattern;

public class Token {
    
    private String regex;
    private String descripcion;
    private boolean ignorar;
    
    public Token (String regex, String descripcion, boolean ignorar){
        
        this.regex = regex;
        this.descripcion = descripcion;
        this.ignorar = ignorar;
        
    }
    
    public void setRegex (String regex){
        this.regex = regex;
    }
    
    public String getRegex (){
        return regex;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion (){
        return descripcion;
    }
    
    public void setIgnorar (boolean ignorar){
        this.ignorar = ignorar;
    }
    
    public boolean getIgnorar (){
        return ignorar;
    }
    
}
