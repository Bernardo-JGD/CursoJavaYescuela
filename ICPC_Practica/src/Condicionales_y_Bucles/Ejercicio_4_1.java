
package Condicionales_y_Bucles;


import java.util.Scanner;

public class Ejercicio_4_1 {
    //4. Pedir números hasta que se teclee uno negativo, 
    //y mostrar cuántos números se han introducido.
    //aqui cuento solo los positivos y uso if para contador
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num, contador = 0;
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num>=0) {
                contador++;
            }
        }while (num>=0);
        System.out.println("Total numeros ingresados (menos el negativo) : " + contador);
    }
    
}
