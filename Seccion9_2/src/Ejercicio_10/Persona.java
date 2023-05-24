
package Ejercicio_10;

public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona (String nombre , String apellido, int edad){
        this.nombre = nombre; 
        this.apellido = apellido;
        this.edad = edad;
    }
    public void viajar (){
        System.out.println("Viajar");
    }
    public abstract void partidoFutbol();
    public abstract void entrenamiento();
    
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public int getEdad (){
        return edad;
    }
    
}