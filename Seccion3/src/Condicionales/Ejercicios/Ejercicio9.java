package Condicionales.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.  ");
        System.out.println("Suponiendo que todos los meses son de 30 dias");

        int dia, mes, year;
        System.out.println("Ingrese el dia ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año ");
        year = leer.nextInt();

        if ((dia <= 30 && dia >= 1) && (mes <= 12 && mes >= 1) && (year != 0)) {
            System.out.println("La fecha" + dia + "/" + mes + "/" + year + " es correcta");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es incorrecta");
        }

        if ((dia <= 30 && dia >= 1)) {
            if (mes >= 1 && mes <= 12) {
                if (year != 0) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es correcta");
                } else {
                    System.out.println("Año " + year + " incorrecto");
                }
            } else {
                System.out.println("Mes " + mes + " incorrecto");
            }
        } else {
            System.out.println("Dia " + dia + " incorrecto");
        }
    }
}
