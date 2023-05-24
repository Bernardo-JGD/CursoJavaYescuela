
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_19 {
    //19. Pedir dos fechas y mostrar el número de días que hay de diferencia. 
    //Suponiendo todos los meses de 30 días.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int dia_1, mes_1, year_1, dia_2, mes_2, year_2;
        int dias_year;
        
        // Nota: estoy suponiendo que la fecha 1 es menor que la fecha 2
        
        System.out.println("Fecha 1");
        System.out.println("Ingrese el dia");
        dia_1 = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes_1 = leer.nextInt();
        System.out.println("Ingrese el año");
        year_1 = leer.nextInt();
        
        System.out.println("Fecha 2");
        System.out.println("Ingrese el dia");
        dia_2 = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes_2 = leer.nextInt();
        System.out.println("Ingrese el año");
        year_2 = leer.nextInt();
        
        //suponemos que las fechas introducidas son correctas
        //convertimos las fechas a dias y calculamos la diferencia
        
        dias_year = dia_2-dia_1 + (30*(mes_2 - mes_1)) + (365*(year_2 - year_1));
        if (dias_year <0) {
            dias_year = dias_year*-1;
        }
        System.out.println(dias_year);
    }
    
}
