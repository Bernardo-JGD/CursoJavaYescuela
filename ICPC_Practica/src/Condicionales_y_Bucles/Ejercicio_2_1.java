package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_2_1 {

    //2. Leer un número e indicar si es positivo o negativo. 
    //El proceso se repetirá hasta que se introduzca un 0.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;
        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();
        while (num != 0) {

            if (num > 0) {
                //mayor que cero: positivo             }
                System.out.println("Positvo");
            }else{
                //si no es positivo: es negativo
                System.out.println("Negativo");
            }// repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro numero: ");
            num = leer.nextInt();

        }// al salir del mientras tenemos la certeza de que num es 0 
    }
}
