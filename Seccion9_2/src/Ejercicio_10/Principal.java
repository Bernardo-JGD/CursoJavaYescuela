
package Ejercicio_10;

//-------------------------Crear un programa para simular un equipo de futbol (fubtbolista, entrenador y doctor) para lo 
//-------------------------cual tendremos lo siguiente: 
//---------------------------Una superclase persona que tendra los siguientes datos: nombre, apellido y edad
//---------------------------Una subclase futbolista que tendra los siguientes datos: dorsal y posicion
//---------------------------Una subclase entrenador que tendra los siguientes datos: estrategia
//---------------------------Una subclase doctor que tendra los siguientes datos: titulacion y años de experiencia
//-------------------------Hacer un menu donde se tengan las siguientes opciones: viaje de equipo, entrenamiento, partido
//-------------------------de futbol, planificar entrenamiento, entrevista, curar lesion
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    
    static Scanner leer = new Scanner (System.in);
    static ArrayList <Persona> persona = new ArrayList <Persona> (); 
    
    static Persona futbolista1 = new Futbolista ("Poo", "Panda", 20, 11, "Medio");
    static Persona futbolista2 = new Futbolista ("Tigresa", "Tigre", 24, 15, "Delantero");
    static Persona entrenador = new Entrenador("Shifu", "Panda Rojo", 60, "¡CORRAN!");
    static Persona medico = new Doctor ("Gregory", "House", 55, "Badass", 1000);
    
    public static void main(String[] args) {
        
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        menu();
        
        
    }
    public static void menu (){
        int opcion;
        do{
        System.out.println("Menu");
        System.out.println("1.Viaje de equipo 2.Entrenamiento 3.Partido futbol" +"\n4.Planificar entrenamiento 5.Entrevista 6.Curar");
        System.out.println("7.Salir");
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1 :
                viajarEquipo();
                break;
                
            case 2 :
                entrenarEquipo();
                break;
                
            case 3 :
                partidoEuipo();
                break;
                
            case 4 :
                planificarEntrenamiento();
                break;
                
            case 5 :
                DarEntrevista ();
                break;
                
            case 6 :
                curarLesion ();
                break;
                
            case 7 :
                System.out.println("Adios :D D:");
                break;
                
            default :
                System.out.println("Eso no existe aqui :v ");
                break;
        }
        }while (opcion !=7);
        
    }
    public static void viajarEquipo (){
        for (Persona equipo: persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido() + "->");
            equipo.viajar();
        }
    }
    public static void entrenarEquipo (){
        for (Persona equipo: persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido() + "->");
            equipo.entrenamiento();
        }
    }
    public static void partidoEuipo (){
        for (Persona equipo: persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellido() + "->");
            equipo.partidoFutbol();
        }
    }
    public static void planificarEntrenamiento (){
        System.out.println(entrenador.getNombre() + " " + entrenador.getApellido() );
        //lo que esta haciendo aqui es un downcasting
        ((Entrenador)entrenador).entrenamiento();
        //el objeto entrenador es de tipo persona pero lo estoy bajando a tipo entrenador para usar de manera mas correcta
        //el metodo entrenamiento
    }
    public static void DarEntrevista (){
        //en esta parte tambien estoy haciendo downcasting pra poder usar los metodos de cada clase 
        System.out.println(futbolista1.getNombre() + " " + futbolista1.getApellido() + "->");
        ((Futbolista)futbolista1).entrevista();
        System.out.println(futbolista2.getNombre() + " " + futbolista2.getApellido() + "->");
        ((Futbolista)futbolista2).entrevista();
    }
    public static void curarLesion (){
        //tambien voy a hacer downcasting de persona a doctor
        System.out.println(medico.getNombre() + " " + medico.getApellido() + "->");
        ((Doctor)medico).curarLesiones();
    }
    
}
