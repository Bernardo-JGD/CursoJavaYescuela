
package Ejercicio2_1;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Tablero t;
        int sino, opcion, espacios;
        
        t = new Tablero (0, 0);
        
        
        do{
            System.out.println("1.Arriba----2.Abajo----3.Derecha----4.Izquierda");
            System.out.println("Digite el numero de la accion que desea realizar ");
            opcion = leer.nextInt();
            
            System.out.println("¿Cuantos espacion desea moverse");
            espacios = leer.nextInt();
            switch (opcion){
                
                case 1 : t.arriba(espacios); break;
                case 2 : t.abajo(espacios); break;
                case 3 : t.derecha(espacios); break;
                case 4 : t.izquierda(espacios); break;
                default: System.out.println("Esa opcion no existe"); break;
                
            }
            System.out.println("La posicion inicial es: " + "(" +t.getX() + ", " + t.getY() + ")" + "\n");
            System.out.println("¿Desea regresar al menu");
            System.out.println("1. Si   2. No");
            sino = leer.nextInt();
        }while (sino != 2);
        
    }
    
}
