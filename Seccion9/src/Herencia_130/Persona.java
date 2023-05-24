
package Herencia_130;


public class Persona {
    //si dejo el tipo de acceso private, la clase hija no puede acceder al atributo
    //si dejo el encapsulamiento con private, en las clases hijas tengo que usar los geters para mostrar y usar los atributos
    
    //si pongo el tipo de acceso protected, puedo hacer que las clases hijas tengan acceso a los atributos
    //protected String nombre;
    //protected String apellidos;
    //protected int edad
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellidos (){
        return apellidos;
    }
    public int getEdad (){
        return edad;
    }
    
}
