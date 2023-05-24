/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salvar;
import java.util.Scanner;
public class Main {
    //g
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 0, menor = 1000;
        n = leer.nextInt();

        if (n >= 1 && n <= 10000000) {

            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = leer.nextInt();
                if (ar[i] >= 1 && ar[i] <= 1000000000) {
                    ar[i] = ar[i];
                } else {
                    i--;
                }

                if (ar[i] < menor) {
                    menor = ar[i];
                }

            }
        }
        System.out.println(menor);

    }

}


