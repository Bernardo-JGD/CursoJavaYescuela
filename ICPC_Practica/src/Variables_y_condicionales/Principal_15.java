
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_15 {
    //15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
    //Suponiendo todos los meses de 30 días. 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int dia, mes, year;
        System.out.println("Ingrese una fecha");
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el numero de mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el numer ode año");
        year = leer.nextInt();
        
        if (dia>=1 && dia <=30) {
            if (mes>=1 && mes <=12) {
                if (year != 0) {
                    System.out.println("Fecha correcta");
                }else{
                    System.out.println("Fecha incorrecta, el año no existe");
                }
            }else{
                System.out.println("Fecha incorrecta, el més no existe");
            }
        }else{
            System.out.println("Fecha incorrecta, el dia no existe");
        }
        
        
    }
    
}
