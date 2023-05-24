
package Ejercicio_10;


public class Futbolista extends Persona {
    
    private int dorsal;
    private String posicion;
    
    public Futbolista (String nombre, String apellido, int edad, int dorsal, String posicion){
        super (nombre, apellido, edad);
    }
    @Override
    public void partidoFutbol (){
        System.out.println("Jugar partido");
    }
    @Override 
    public void entrenamiento (){
        System.out.println("Entrena");
    }
    public void entrevista (){
        System.out.println("Dando una entrevista");
    }
    public int getDorsal (){
        return dorsal;
    }
    public String getPosicion (){
        return posicion;
    }
    
    
}
