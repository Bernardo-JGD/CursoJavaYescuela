
package Ejercicio4;
//-----------------------Construir un programa para una competencia de atletismo,
//-----------------------el programa debe gestionar una serie de atletas caracterizados
//-----------------------por su numero de atleta, nombre y tiempo de carrera, al final
//-----------------------el programa debe mostrar los datos del atleta ganador de la carrera 
public class Atleta {
    
    private int numero_atleta;
    private String nombre;
    private float tiempo;
    
    public Atleta (int numero_atleta, String nombre, float tiempo){
        this.numero_atleta = numero_atleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public float getTiempo (){
        return tiempo;
    }
    public String mostrar (){
        return "Numero: " + numero_atleta + "\nNombre: " + nombre + "\nTiempo: " + tiempo + "\n";
    }
    
}
