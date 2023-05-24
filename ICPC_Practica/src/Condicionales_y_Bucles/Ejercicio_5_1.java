
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_5_1 {
    //5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
    //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
    //El proceso termina cuando el usuario acierta.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int n, num;
        // n es el numero que hay que acertar 
        // num guarda los numeros introducidos
        n = (int) (Math.random()*100)+1;
        System.out.println(n);
        //en lugar de pedir n podemos hacer que n tome un valor
        //aleatorio entre 1 y 100
        //Asi el juego es algo más entretenido
        
        System.out.println("Introduce un numero");
        num = leer.nextInt();
        
        while (num != n){//mientras no coincidan ambos numeros
            if (num>n) {
                System.out.println("menor");
            }else{
                System.out.println("mayor");
            }
            System.out.println("Introduce un numero: ");
            num = leer.nextInt();
        }
        // al salir del while tenemos la certeza que num es igual a n 
        System.out.println("¡acertaste!");
    }   
    
}
