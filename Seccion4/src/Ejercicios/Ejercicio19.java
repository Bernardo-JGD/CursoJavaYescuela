package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Dadas 6 notas, escribir la cantidad de alumnos aprobados");
        System.out.println("Condicionado (=4) suspensos  y suspensos");

        int calificiacion, cal_apro = 0, cal_con = 0, cal_sus = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese la calificacion del alumno " + i);
            calificiacion = leer.nextInt();
            
            if (calificiacion>4 && calificiacion<11) {
                cal_apro++;
            }
            if (calificiacion == 4) {
                cal_con++;
            }
            if (calificiacion<4) {
                cal_sus++;
            }
        }
        System.out.println("Alumnos aprobados--- " + cal_apro);
        System.out.println("Alumnos condicionados--- " + cal_con);
        System.out.println("Alumnos suspensos--- "  + cal_sus);

    }

}
