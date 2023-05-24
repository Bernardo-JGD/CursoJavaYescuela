
package Ventana_191_DefaultComboBoxModel;


public class Persona {
    
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    public Persona (String nombre, int edad, String nacionalidad){
        
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
        
    public int getEdad (){
        return edad;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public String getNacionalidad (){
        return nacionalidad;
    }
    
    public void setNacionalidad (String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString (){
        return nombre;
    }
    
    public String mostrar (){
        return nombre + edad + nacionalidad;
    }
}
