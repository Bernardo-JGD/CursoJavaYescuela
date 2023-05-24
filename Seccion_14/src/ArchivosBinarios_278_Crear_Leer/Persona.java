
package ArchivosBinarios_278_Crear_Leer;

import java.io.Serializable;


public class Persona implements Serializable{
    
    private String nombre;
    private int edad;
    
    public Persona (String persona, int edad){
        
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public void mostrarDatos (){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("");
        
    }
    
}