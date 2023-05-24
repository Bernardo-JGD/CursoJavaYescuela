
package Ejercicio_10;


public class Doctor extends Persona {
    
    private String titulacion;
    private int experiencia;
    
    public Doctor (String nombre, String apellido, int edad, String titulacion, int experiencia){
        super (nombre, apellido, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }
    @Override
    public void partidoFutbol (){
        System.out.println("Da asistencia y hace la curacion :3");
    }
    @Override 
    public void entrenamiento (){
        System.out.println("Ta checando que no se maten en el entrenamiento y los cura :D");
    }
    public void curarLesiones (){
        System.out.println("Curando lesiones lesionadas :D :v ");
    }
    
    public String getTitulacion (){
        return titulacion;
    }
    public int getExperiencia (){
        return experiencia;
    }
    
}
