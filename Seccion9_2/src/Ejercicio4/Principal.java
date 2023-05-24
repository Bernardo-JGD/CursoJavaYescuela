
package Ejercicio4;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int numero_a;
        String nombre_a;
        float tiempo_carrera;
        int numero_atletas;
        
        System.out.println("Ingrese el numero de atletas a participar");
        numero_atletas = leer.nextInt();
        
        Atleta atletas[] = new Atleta [numero_atletas];
        
        for (int i = 0; i < atletas.length; i++) {            
            System.out.println("Ingrese el numero de atleta");
            numero_a = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese el nombre de atleta");
            nombre_a = leer.nextLine ();
            System.out.println("Ingrese el tiempo de la carrera");
            tiempo_carrera = leer.nextFloat ();
            
            atletas[i] = new Atleta (numero_a, nombre_a, tiempo_carrera);
            
        }
        
        System.out.println("El atleta ganador es: " );
        System.out.println(atletas[indice_ganador(atletas)].mostrar_datos_ganador());
        
        
    }
    
    public static int indice_ganador (Atleta a[]){
        
        int indice = 0;
        float tiempo_carrera = a[indice].getTiempo_carrera();
        
        for (int i = 1; i < a.length; i++) {
            if (a[i].getTiempo_carrera()< tiempo_carrera) {
                tiempo_carrera = a[i].getTiempo_carrera();
                indice = i;
            }
        }
        
        return indice;
    }
    
}
