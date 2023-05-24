package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Pedir 10 numeros");
        System.out.println("Mostrar la media de los numeros positivos");
        System.out.println("Mostrar la media de los numeros negativos");
        System.out.println("Y la cantidad de ceros");

        double numero, sumamas = 0, sumamenos = 0;
        int incremas = 0, incremenos = 0, increceros = 0;
        double mediamas = 0, mediamenos = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("ingrese un numero");
            numero = leer.nextInt();
            if (numero > 0) {
                sumamas = sumamas + numero;
                incremas++;
            } else {
                if (numero < 0) {
                    sumamenos = sumamenos + numero;
                    incremenos++;
                } else {
                    increceros++;
                }
            }
        }
        mediamas = sumamas / incremas ;
        mediamenos = sumamenos / incremenos ;
        System.out.println("Media mas: " + mediamas);
        System.out.println("Media menos: " + mediamenos);
        System.out.println("Cantidad de 0 : " + increceros);

    }

}
