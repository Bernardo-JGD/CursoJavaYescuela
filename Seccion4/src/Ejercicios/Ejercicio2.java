
package Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Leer un numero e indicar si es positivo o negativo.");
        System.out.println("El proceso se repetira hasta que se introduzca un 0");
        
        int numero;
        do{
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if (numero>0) {
                System.out.println("El numero " + numero + " es positivo");
            }else{
                if (numero<0) {
                    System.out.println("El numero " + numero + " es negativo");
                }else{
                    if (numero == 0) {
                        System.out.println("El numero " + numero + " es " + 0 );
                        System.out.println("Fin del ciclo");
                    }
                }
            }
        }while (numero!=0);
        
    }
}
