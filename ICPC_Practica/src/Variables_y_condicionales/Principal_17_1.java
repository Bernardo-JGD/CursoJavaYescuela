
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_17_1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int dia, mes, año;
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        año = leer.nextInt();
        
        // supongamos que la fecha introducida es correcta
        //incrementamos el dia
        dia ++;
        //si el dia supera a 30 lo reiniciamos a 1 e incrementamos el mes
        
        if (dia >30) {
            
            dia = 1;
            mes++;
            
            //si el mes supera 12 lo reiniciamos a 1 e incrementamos el año
            if (mes >=12) {
                mes = 1;
                año++;
            }
            
        }
        // habria que tener en cuenta que el año pasa del -1 al +1
        // en este codigo pasariamos el año -1 al 0 (que nunca existio)
        // para corregirlo 
        
        if (año == 0) {
            año = 1;
        }
        System.out.println(dia + "/" + mes + "/" + año);
        
    }
    
}
