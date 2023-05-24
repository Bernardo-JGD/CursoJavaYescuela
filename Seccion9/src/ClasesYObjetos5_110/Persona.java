
package ClasesYObjetos5_110;


public class Persona {
    //Atributos
    
    String nombre;
    int edad;
    
    //metodo constructor
    public Persona (String nombre, int edad){
        //cada vez que yo ponga el this.variable/atributo, lo diferencia del valor que esta recibiendo el metodo 
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar_datos (){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }
    
}
