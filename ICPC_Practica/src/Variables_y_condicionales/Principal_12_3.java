
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_12_3 {
    //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un numero entre 0 y 99999");
        num = leer.nextInt();
        
        if ( (num>=0 && num<=9) || (num<=0 && num>=-9)) {
            System.out.println("Es de una cifra: " + num);
        }else{
            if ( (num>=10 && num<=99) || (num<=-10 && num>=-99) ) {
                num = ((num%10)*10) + (num/10);
                System.out.println(num);
            }else{
                if ( (num>=100 && num<=999) || (num<=-100 && num>=-999) ) {
                    num = ((num%10)*100) + (((num/10)%10)*10) + (num/100);
                    System.out.println(num);
                }else{
                    if ( (num>=1000 && num<=9999) || (num<=-1000 && num>=-9999) ) {
                        num = ((num%10)*1000) + (((num/10)%10)*100) + (((num/100)%10)*10) + (num/1000);
                        System.out.println(num);
                    }else{
                        if ( (num>=10000 && num<=99999) || (num<=-10000 && num>=-99999) ) {
                            num = ((num%10)*10000) + (((num/10)%10)*1000) + (((num/100)%10)*100) + (((num/1000)%10)*10) + (num/10000);
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
