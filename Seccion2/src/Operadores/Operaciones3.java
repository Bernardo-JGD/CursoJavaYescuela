
package Operadores;

import java.util.Scanner;
public class Operaciones3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int x = 0, x1 = 0;
        System.out.println("Ingrese un numero");
        x = leer.nextInt();
        x1 = x;
        x++;
        System.out.println("Ingremento como sufijo");
        System.out.println("Su numero es: " + x1);
        System.out.println("El incremento en 1 del numero que ingreso es: " + x);
        x1--;
        System.out.println("El decremento en 1 del numero que ingreso es: " + x1);
        
        int y = 0, y1 = 0;
        System.out.println("Ingrese un numero");
        y = leer.nextInt();
        y1= y;
        ++y;
        System.out.println("Incremento como prefijo");
        System.out.println("Su numero es: " + y1);
        System.out.println("El incremento en 1 del numero que ingreso es: " + y);
        y1--;
        System.out.println("El decremento en 1 del numero que ingreso es: " + y1);
        
        
        System.out.println("Como pasa en el video");
        System.out.println("Ingrese un numero");
        int m, n;
        m = leer.nextInt();
        n = m++; // primero asigna y luego incrementa 
        System.out.println("El numero ahora es: " + n + " ... el mismo >:v");
        System.out.println("Pero aquí ya cambio: " + m + " :3");
        int b, c;
        System.out.println("Ingrese un numero");
        b = leer.nextInt();
        c = ++b; // primero incrmenta y luego asigna
        System.out.println("");
        
        System.out.println("Ingrese un numero");
        int u, v;
        u = leer.nextInt();
        v = u--; // primero asigna y luego decrementa
        System.out.println("El numero ahora es: " + v + " ... el mismo >:v");
        System.out.println("Pero aquí ya cambio: " + u + " :3");
        
        
        
    }
    
}
