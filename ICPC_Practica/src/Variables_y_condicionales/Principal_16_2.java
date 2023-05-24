package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_16_2 {

    //16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
    //Sin años bisiestos.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia = 0, mes = 0, year = 0;

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

            if (mes < 0 || mes > 12) {
                System.out.println("Mes fuera del rango");
            }

        } while (mes < 0 || mes > 12);

        if (mes == 2) {
            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();

                if (dia < 0 || dia > 28) {
                    System.out.println("Dia incorrecto");
                }
            } while (dia < 0 || dia > 28);
            System.out.println("Fecha " + dia + "/" + mes + "/" + year + " correcta");
        }
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            do {
                System.out.println("Ingrese el dia");
                dia = leer.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia incorrecto");
                }
            } while (dia < 1 || dia > 30);
            
            System.out.println("Fecha " + dia + "/" + mes + "/" + year + " correcta");
        } else {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
                do {
                    System.out.println("Ingrese el dia");
                    dia = leer.nextInt();

                    if (dia < 1 || dia > 31) {
                        System.out.println("Dia incorrecto");
                    }
                } while (dia < 1 || dia > 31);
                System.out.println("Fecha " + dia + "/" + mes + "/" + year + " correcta");
            }
        }

    }

}
