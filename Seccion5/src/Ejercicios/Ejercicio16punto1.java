
package Ejercicios;

import java.util.Scanner;
public class Ejercicio16punto1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un centro educativo.");
        System.out.println("Cada grupo o clase está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo");
        System.out.println("y tercer trimestre de un grupo. Debemos mostrar al final la nota media del grupo en cada trimestre");
        System.out.println("y la media del alumno que se encuentra en la posicion N (N se lee por teclado)");
        
        float trimestre1[] = new float [5];
        float trimestre2[] = new float [5];
        float trimestre3[] = new float [5];
        
        float suma1 = 0, suma2 = 0, suma3 = 0;
        float promedio1 = 0, promedio2 = 0, promedio3 = 0;
        int posicion = 0;
        float suma_al = 0, promedio_al = 0;
        
        System.out.println("Digite las notas del primer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificacion del Alumno\t" + (i+1));
            trimestre1[i] = leer.nextFloat();
            suma1 = suma1 + trimestre1[i];
        }
        System.out.println("Digite las notas del segundo trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificacion del Alumno " + (i+1));
            trimestre2[i] = leer.nextFloat();
            suma2 = suma2 + trimestre2[i];
        }
        System.out.println("Digite las notas del tercer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificacion del Alumno " + (i+1));
            trimestre3[i] = leer.nextFloat();
            suma3 = suma3 + trimestre3[i];
        }
        promedio1 = suma1/5;
        promedio2 = suma2/5;
        promedio3 = suma3/5;
        
        
        do{
            System.out.println("Ingrese la posicion del alumno del cual quiere saber su promedio");
            posicion = leer.nextInt();
        }while (posicion<0 || posicion>4);
        
        suma_al = trimestre1[posicion] + trimestre2[posicion] + trimestre3[posicion];
        promedio_al = suma_al/3;
        
        System.out.println("Promedio trimestre 1 --- " + promedio1);
        System.out.println("Promedio trimestre 2 --- " + promedio2);
        System.out.println("Promedio trimestre 3 --- " + promedio3);
        System.out.println("El promedio del alumno " + (posicion+1) + " es " + promedio_al);
        
    }
    
}
