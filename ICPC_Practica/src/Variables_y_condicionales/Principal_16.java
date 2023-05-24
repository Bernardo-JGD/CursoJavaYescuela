package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_16 {

    //16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
    //Sin años bisiestos.
    //como en el libro
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int dia, mes, year;
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        year = leer.nextInt();

        //el unico año que no existe es el 0 
        if (year == 0) {
            System.out.println("Fecha incorrecta");
        } else {
            if (mes == 2 && (dia >= 1 && dia <= 28)) {
                System.out.println(dia + "/" + mes + "/" + year);
                System.out.println("Fecha correcta");
            } else {
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
            }
        }
    }

}
