package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_12_2 {
    //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num, u, d, c, um, dm;
        System.out.println("Ingrese un numero de 5 digitos enteros");
        num = leer.nextInt();
        if ((num >= 0 && num <= 9) || (num <= 0 && num >= -9)) {
            System.out.println("Es de una sola cifra, no lo puedo voltear: ");
        } else {
            if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
                u = num % 10;
                num = num / 10;
                num = (u * 10) + num;
                System.out.println(num);
            } else {
                if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
                    //unidades que serán centenas
                    u = num % 10;
                    num = num / 10;

                    //decenas que se quedan igual
                    d = num % 10;
                    num = num / 10;

                    num = (u * 100) + (d * 10) + num;
                    System.out.println(num);

                } else {
                    if ((num >= 1000 && num <= 9999) || (num <= -1000 && num >= -9999)) {
                        //unidades que serán centenas 
                        u = num % 10;
                        num = num / 10;

                        //decenas que se quedan igual
                        d = num % 10;
                        num = num / 10;

                        c = num % 10;
                        num = num / 10;

                        num = (u * 1000) + (d * 100) + (c * 10) + num;
                        System.out.println(num);
                    } else {
                        if ((num >= 10000 && num <= 99999) || (num <= -10000 && num >= -99999)) {
                            u = num % 10;
                            num = num / 10;

                            //decenas que se quedan igual
                            d = num % 10;
                            num = num / 10;

                            c = num % 10;
                            num = num / 10;
                            
                            dm = num % 10;
                            num = num / 10;
                            
                            num = (u*10000) + (d*1000) + (c*100) + (dm*10) + num;
                            System.out.println(num);
                        }else{
                            System.out.println("Es de más de 5 cifras");
                        }
                    }
                }
            }
        }

    }

}
