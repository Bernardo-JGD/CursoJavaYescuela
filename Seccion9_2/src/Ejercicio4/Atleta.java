
package Ejercicio4;

//-----------------------Construir un programa para una competencia de atletismo,
//-----------------------el programa debe gestionar una serie de atletas caracterizados
//-----------------------por su numero de atleta, nombre y tiempo de carrera, al final
//-----------------------el programa debe mostrar los datos del atleta ganador de la carrera 

public class Atleta {
    
    private int numero_atleta;
    private String nombre;
    private float tiempo_carrera;
    
    public Atleta (int numero_atleta, String nombre, float tiempo_carrera){
        this.numero_atleta = numero_atleta;
        this.nombre = nombre;
        this.tiempo_carrera = tiempo_carrera;
    }
    
    public float getTiempo_carrera (){
        return tiempo_carrera;
    }
    
    public String mostrar_datos_ganador (){
        
        return "Numero de atleta: " + numero_atleta + "\n" + "Nombre de atleta: " + nombre + "\n" + "Tiempo de carrera: " + tiempo_carrera;
        
    }
    
}
