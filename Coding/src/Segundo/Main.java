package Segundo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n, m, h, aux_conta = 1;
        n = leer.nextInt();
        m = leer.nextInt();

        int infectados[] = new int[n];
        int no[] = new int [n];

        int mat[][] = new int[m][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = leer.nextInt();
            }
        }
        infectados[0] = 0;
        h = leer.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                if ((mat[i][j] == infectados[0])) {
                    infectados[aux_conta] = mat[i][j + 1];
                    aux_conta++;
                } else {

                }
            }
        }
        System.out.println(aux_conta);
       

    }

}
