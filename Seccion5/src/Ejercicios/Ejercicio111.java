package Ejercicios;

import java.util.Scanner;

public class Ejercicio111 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer 5 elementos numericos que se introduciran ordenados de forma creciente. ");
        System.out.println("Estos los guardaremos en una tabla de tamaño 10. Leer un numero N e insertarlo en el lugar");
        System.out.println("adecuado para que la tabla cotinue ordenada ");

        int ar[] = new int[10];
        int creciente = 0, numero, posicion = 0 ;
        System.out.println("Llenar el arreglo");
        do {
            // llenando el arrelgo
            creciente = 0;
            for (int i = 0; i < 5; i++) {

                System.out.print((i + 1) + " Digite un numero ");
                ar[i] = leer.nextInt();
                if (i > 0) {
                    if (ar[i] > ar[i - 1]) {
                        creciente++;
                    }
                }
            }
            if (creciente < 4) {
                System.out.println("Numeros desordenados");
            } else {
                System.out.println("Numeros ordenados");
            }

        } while (creciente != 4);
        System.out.println("Ingrese un numero entero para insertar");
        numero = leer.nextInt();
        // sacando la posicion en la que ira el nuevo numero
        for (int i = 0; i < 5; i++) {
            if (numero>ar[i] && numero<ar[i+1]) {
                posicion = i+1;
            }
        }
        // dejando el espacion para el numero que el usuario quiere introducir
        for (int i = 4; i>=posicion; i--) {
            ar[i+1] = ar[i];
        }
        ar[posicion] = numero;
        System.out.println("El arreglo con el numero insertado es");
        for (int i = 0; i < 6; i++) {
            System.out.print("-" + ar[i] + "-");
        }
    }

}
