package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_16_1 {

    //16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
    //Sin años bisiestos.
    //como pienso yo, y otra forma es con do while al principio 
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes, year;
        boolean m = false, a = true;

        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        year = leer.nextInt();

        switch (mes) {

            case 1:
                //dia 31
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }

                break;

            case 2:
                //dia 28 
                if ((dia >= 1 && dia <= 28) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 28) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    } else {
                        if ((dia >= 1 && dia <= 28) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        } else {
                            if ((dia < 1 || dia > 28) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }

                break;

            case 3:
                //dia 31
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }

                break;

            case 4:
                //dia 30
                if ((dia >= 1 && dia <= 30) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 30) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=30) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>30) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }

                break;

            case 5:
                //dia 31
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 6:
                //dia 30
                if ((dia >= 1 && dia <= 30) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 30) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=30) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>30) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 7:
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 8:
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 9:
                if ((dia >= 1 && dia <= 30) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 30) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=30) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>30) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 10:
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 11:
                if ((dia >= 1 && dia <= 30) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 30) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=30) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>30) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            case 12:
                if ((dia >= 1 && dia <= 31) && (year != 0)) {
                    System.out.println(dia + "/" + mes + "/" + year);
                    System.out.println("Fecha correcta");
                } else {
                    if ((dia < 1 || dia > 31) && (year != 0)) {
                        System.out.println(dia + "/" + mes + "/" + year);
                        System.out.println("Fecha incorrecta");
                        System.out.println("Dia fuera del rango");
                    }else{
                        if ((dia>= 1 && dia<=31) && (year == 0)) {
                            System.out.println(dia + "/" + mes + "/" + year);
                            System.out.println("Fecha incorrecta");
                            System.out.println("Año incorrecto");
                        }else{
                            if ((dia<1 || dia>31) && (year == 0)) {
                                System.out.println(dia + "/" + mes + "/" + year);
                                System.out.println("Fecha incorrecta");
                                System.out.println("Dia y año incorrectos");
                            }
                        }
                    }
                }
                break;

            default:
                System.out.println("Fecha incorrecta");
                System.out.println("Mes incorrecto");
                break;

        }

    }

}
