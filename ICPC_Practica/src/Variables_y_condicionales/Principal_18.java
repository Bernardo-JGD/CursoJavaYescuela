package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_18 {
    //18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días 
    //(suponer que febrero tiene
    //siempre 28 días).

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int dia, mes, year;
        boolean fecha = true;
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
                System.out.println("Mes incorrecto");
            } else {
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                    do {
                        System.out.println("Ingrese el día");
                        dia = leer.nextInt();
                        if (dia < 1 || dia > 30) {
                            System.out.println("Dia Incorrecto D:");
                        } else {
                            System.out.println("Fecha correcta :D");
                            System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);
                            if (dia == 30) {
                                dia = 1;
                                mes++;
                                System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                            } else {
                                dia++;
                                System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                            }

                        }
                    } while (dia < 1 || dia > 30);
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
                        do {
                            System.out.println("Ingrese el día");
                            dia = leer.nextInt();
                            if (dia < 1 || dia > 31) {
                                System.out.println("Dia Incorrecto D:");
                            } else {
                                System.out.println("Fecha correcta :D");
                                System.out.println("Fecha actual: " + dia + "/" + mes + "/" + year);

                                if (mes == 12 && dia == 31) {
                                    year++;
                                    dia = 1;
                                    mes = 1;
                                    System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                } else {
                                    if (dia == 31 && mes < 12) {
                                        dia = 1;
                                        mes++;
                                        System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                    }
                                    if (dia<31 && mes ==12) {
                                        dia++;
                                        System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                    }
                                    if (dia<31 && mes<12) {
                                        dia++;
                                        System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                    }
                                }
                            }
                        } while (dia < 1 || dia > 31);
                    }if (mes == 2) {
                        do{
                            
                            System.out.println("Ingrese el dia ");
                            dia = leer.nextInt();
                            
                            if (dia<1 || dia>28) {
                                System.out.println("Dia incorrecto");
                            }else{
                                System.out.println("Fecha correcta");
                                System.out.println("Fecha actual " + dia + "/" + mes + "/" + year);
                                
                                if (dia == 28) {
                                    dia = 1;
                                    mes++;
                                    System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                }else{
                                    dia ++;
                                    System.out.println("Fecha del dia siguiente: " + dia + "/" + mes + "/" + year);
                                }
                                
                            }
                        }while (dia<1 || dia>28);
                    }
                }
            }

        } while (mes < 1 || mes > 12);

    }

}
