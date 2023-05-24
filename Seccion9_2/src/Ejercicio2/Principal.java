
package Ejercicio2;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Tablero t1;
        int x, y, opcion, incremento = 0;
        
        System.out.println("Ingrese la posicion inicial en x");
        x = leer.nextInt();
        System.out.println("Ingrese la posicion inicial en y");
        y = leer.nextInt();
        
        //posicion inicial
        t1 = new Tablero (x, y);
        
        do{
            
            System.out.println("1.Mover hacia ARRIBA");
            System.out.println("2.Mover hacia ABAJO");
            System.out.println("3.Mover hacia la DERECHA");
            System.out.println("4.Mover hacia la IZQUIERDA");
            System.out.println("5.Salir");
            System.out.println("Digite el numero de la opcion que desea realizar");
            opcion = leer.nextInt();
            
            if(opcion != 5){
                System.out.println("Digite la cantidad de espacion que desea moverse");
                incremento = leer.nextInt();
            }
            switch (opcion){
                
                case 1 :
                    t1.mover_arriba(incremento);
                    break;
                    
                case 2 :
                    t1.mover_abajo(incremento);
                    break;
                    
                case 3 :
                    t1.mover_derecha(incremento);
                    break;
                    
                case 4 :
                    t1.mover_izquierda(incremento);
                    break;
                    
                case 5 :
                    
                    break;
                    
                default :
                    System.out.println("No existe esa opcion");
                break;    
                
            }
            System.out.println("La coordenada actual es: " + "(" + t1.getX() + ", " + t1.getY() + ")");
            
            
        }while (opcion != 5);
        
        
    }
    
}
