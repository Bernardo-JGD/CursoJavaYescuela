
package ClasesYObjetos9_114;


public class Persona {
    //las constantes se declaran con la palabra reservada "final"
    //las constantes no pueden ser cambiadas
    //por lo tanto no pueden tener metodos set
    //solo se pueden asignar valores al momento que se carga en el constructor y ya no puede ser modificado 
    private final String nombre;
    private int edad;
    
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar_datos (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public int getEdad (){
        return edad;
    }
    
    
    public String getNombre (){
        return nombre;
    }
    
}
