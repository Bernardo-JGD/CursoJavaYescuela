package Bucles.MientrasWhile;

import java.util.Scanner;

public class CicloDo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int i = 1, j = 10, num, k = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        System.out.println("Ingrese la cantidad de numero que quiere");
        num = leer.nextInt();
        do {

            System.out.println(k);
            k++;
        } while (k <= num);

    }

}
