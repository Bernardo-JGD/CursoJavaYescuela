package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_18_1 {

    //18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días 
    //(suponer que febrero tiene
    //siempre 28 días).
    //optimizar el 18_0
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int dia, mes, year;
        do {
            System.out.println("Ingrese el año");
            year = leer.nextInt();

            if (year == 0) {
                System.out.println("Año incorrecto");
            }

        } while (year == 0);

        do {
            System.out.println("Ingrese el mes");
            mes = leer.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Mes fuera del rango");
            }

        } while (mes < 1 || mes > 12);

        if (mes == 2) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();

                if (dia < 1 || dia > 28) {
                    System.out.println("Dia incorrecto");
                }

            } while (dia < 1 || dia > 28);

            if (dia == 28) {
                System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                dia = 1;
                mes++;
                System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
            } else {
                if (dia < 28) {
                    System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                    dia++;
                    System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
                }
            }

        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();

                if (dia < 1 || dia > 30) {
                    System.out.println("Dia incorrecto");
                }

            } while (dia < 1 || dia > 30);

            if (dia == 30) {
                System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                dia = 1;
                mes++;
                System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
            } else {
                if (dia < 30) {
                    System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                    dia++;
                    System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
                }
            }
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();

                if (dia < 1 || dia > 31) {
                    System.out.println("Dia incorrecto");
                }

            } while (dia < 1 || dia > 31);

            if (dia == 31) {
                System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                dia = 1;
                mes++;
                System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
            } else {
                if (dia < 31) {
                    System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                    dia++;
                    System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
                }
            }

        }
        if (mes == 12) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();

                if (dia < 1 || dia > 31) {
                    System.out.println("Dia incorrecto");
                }

            } while (dia < 1 || dia > 31);

            if (dia == 31) {
                System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                dia = 1;
                mes = 1;
                year++;
                if (year == 0) {
                    year = 1;
                }
                System.out.println("Fecha dia siguiente: " + dia + "/" + mes + "/" + year);
            }
        }

    }

}
