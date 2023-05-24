
package Herencia_130;


public class Estudiante extends Persona{
    
    private int codigoEstudiante;
    private float notaFinal;
    
    //constructor 
    public Estudiante (String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal){
        super (nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos (){
        System.out.println("Nombre: " + getNombre() 
        + "\nApellidos: " + getApellidos()
        + "\nEdad: " + getEdad () 
        + "\nCodigo estudiante: " + codigoEstudiante
        + "\nNota final: " + notaFinal);
    }
}
