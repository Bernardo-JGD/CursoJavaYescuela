
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_18_2 {
    //18. Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días 
    //(suponer que febrero tiene
    //siempre 28 días).
    //como viene en el libro 
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int dia, mes, año;
        int dias_del_mes = 0;//guardaremos el numero de dias que tiene el mes
        
        System.out.println("Introduzca dia: ");
        dia = leer.nextInt();
        System.out.println("Introduzca mes: ");
        mes = leer.nextInt();
        System.out.println("Introduzca año: ");
        año = leer.nextInt();
        
        //suponemos que la fecha introducida es correcta
        
        if (mes == 2) {
            dias_del_mes = 28;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias_del_mes = 30;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias_del_mes = 31;
        }
        
        //incrementamod el dia
        dia++;
        //si el dia supera el numero de dias del mes
        //lo reiniciamos a 1 e incrementamos el mes
        
        if (dia >= dias_del_mes) {
            dia = 1;
            mes++;
            //si el mes supera 12, lo reiniciamos a 1 e incrementaos el año
            if (mes >=12) {
                mes = 1;
                año++;
                //esta parte no me hace mucho sentido ya que
                //no hay más que 12 meses
            }
        }
        //habria que tener en cuenta que el año pasa del -1 al +1
        //en este codigo pasariamos del año -1 al 0 (que nunca existio)
        //para corregirlo
        
        if (año == 0) {
            año = 1;
        }
        System.out.println(dia + "/" + mes + "/" + año);
        
    }
    
}
