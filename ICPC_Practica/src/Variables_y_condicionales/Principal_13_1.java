package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_13_1 {

    //13. Pedir un número entre 0 y 99999, decir si es capicúa.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, aux;
        System.out.println("Ingrese un numero entre 0 y 99999");
        num = leer.nextInt();
        aux = num;
        if ((num >= 0 && num <= 9) || (num <= 0 && num >= -9)) {
            System.out.println("Es de una cifra: " + num);
        } else {
            if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
                num = ((num % 10) * 10) + (num / 10);
                System.out.println(num + "---" + aux);
                if (num == aux) {
                    System.out.println(aux + " Es capicua");
                } else {
                    System.out.println(aux + " No es capicua");
                }
            } else {
                if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
                    num = ((num % 10) * 100) + (((num / 10) % 10) * 10) + (num / 100);
                    System.out.println(num + "---" + aux);
                    if (num == aux) {
                        System.out.println(aux + " Es capicua");
                    } else {
                        System.out.println(aux + " No es capicua");
                    }
                } else {
                    if ((num >= 1000 && num <= 9999) || (num <= -1000 && num >= -9999)) {
                        num = ((num % 10) * 1000) + (((num / 10) % 10) * 100) + (((num / 100) % 10) * 10) + (num / 1000);
                        System.out.println(num + "---" + aux);
                        if (num == aux) {
                            System.out.println(aux + " Es capicua");
                        } else {
                            System.out.println(aux + " No es capicua");
                        }
                    } else {
                        if ((num >= 10000 && num <= 99999) || (num <= -10000 && num >= -99999)) {
                            num = ((num % 10) * 10000) + (((num / 10) % 10) * 1000) + (((num / 100) % 10) * 100) + (((num / 1000) % 10) * 10) + (num / 10000);
                            System.out.println(num + "---" + aux);
                            if (num == aux) {
                                System.out.println(aux + " Es capicua");
                            } else {
                                System.out.println(aux + " No es capicua");
                            }
                        } else {
                            System.out.println("Es de más de 5 cifras");
                        }
                    }
                }
            }
        }

    }

}
