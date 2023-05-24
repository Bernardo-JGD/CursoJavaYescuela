package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_15_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dia, mes, year;
        boolean d = false, m = false, a = false;
        System.out.println("Ingrese una fecha");
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        year = leer.nextInt();

        // tratar de que me diga que datos son los que están mal en conjunto 
        if (dia >= 1 && dia <= 30) {
            d = true;
        }
        if (mes >= 1 && mes <= 12) {
            m = true;
        }
        if (year != 0) {
            a = true;
        }
        if (d == true && m == true && a == true) {
            System.out.println("Fecha " + dia + "/" + mes + "/" + year + " correcta");
        } else {
            if ((d == false) && (m == true && a == true)) {
                System.out.println(dia + "/" + mes + "/" + year);
                System.out.println("Dia incorrecto");

            } else {
                if ((d == false && m == false) && a == true) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Dia y mes incorrectos");
                } else {
                    if ((d == true) && (m == false && a == false)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Mes y año incorrectos");
                    } else {
                        if ((d == false) && (m == true) && (a == false)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Dia y año incorrectos");
                        } else {
                            if (d == false && m == false && a == false) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Dia, mes y año incorrectos");
                            } else {
                                if ((d == true) && (m == false) && (a == true)) {
                                    System.out.println(dia + "/" + mes + "/" + year);
                                    System.out.println("Mes incorrecto");
                                } else {
                                    if ((d == true) && (m == true) && (a == false)) {
                                        System.out.println(dia + "/" + mes + "/" + year);
                                        System.out.println("Año incorrecto");
                                    }else{
                                        System.out.println("ERROR");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
