package Ejercicios;

import java.util.Scanner;

public class Ejercicio1punto1 {

    public static void main(String[] args) {

        //------------------------------------ESTE ES EL MIO
        System.out.println("Crear una matriz de tamaño nxm y decir si es simetrica o no");
        Scanner leer = new Scanner(System.in);

        int filas, columnas;
        boolean simetria = true;

        System.out.println("Ingrese el numero de filas");
        filas = leer.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = leer.nextInt();
        int matriz[][] = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[ " + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              //  System.out.print("[ " + matriz[i][j] + "]");
              //  System.out.print("[ " + matriz[j][i] + "]");
                if (matriz[i][j] == matriz[j][i]) {
                    simetria = true;
                } else {
                    simetria = false;
                    i = filas;
                    j = columnas;

                }
            }
           // System.out.println("");
        }
        if (simetria == true) {
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no cumple la simetria");
        }
    }

}
/*
0
1
-2
1
3
0
-2
0
5


3
2
1
1
-4
0
1
0
5



*/
