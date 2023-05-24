
package Ejercicio_10;


public class Entrenador extends Persona {
    
    private String estrategia;
    
    public Entrenador (String nombre, String apellido, int edad, String estrategia){
        super (nombre, apellido, edad);
        this.estrategia = estrategia;
    }
    @Override 
    public void partidoFutbol (){
        System.out.println("Dirige el equipo");
    }
    @Override 
    public void entrenamiento (){
        System.out.println("Dirige un entrenamiento");
    }
    public void planificarEntrenamiento (){
        System.out.println("Planeando :v ");
    }
    public String getEstrategia (){
        return estrategia;
    }
    
    
}
