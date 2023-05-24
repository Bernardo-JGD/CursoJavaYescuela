package Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Pedir calificaciones de 5 alumnos y mostrar si hay algun suspenso");

        int cal = 0;
        boolean sino = false;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la calificacion del alumno " + i);
            cal = leer.nextInt();
            if (cal<6) {
                sino = true;
            }
        }
        System.out.println("Si hay algun suspenso");

    }
}
