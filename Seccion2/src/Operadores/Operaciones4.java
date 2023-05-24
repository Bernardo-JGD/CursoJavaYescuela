
package Operadores;

import java.util.Scanner;

public class Operaciones4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        /*
        //--------------------------------------------------------------------------------------------------------
        double raiznum = 0, aux;
        System.out.println("Ingrese un numero");
        raiznum = leer.nextDouble();
        aux = raiznum;
        raiznum = Math.sqrt(raiznum);
        System.out.println("La raiz cuadrada de " + aux + " es: " + raiznum);
        
        //tambien se puede con datos de tipo int de la siguiente forma
        int raiz, aux1;
        System.out.println("Ingrese un numero");
        raiz = leer.nextInt();
        aux1 = raiz;
        raiz = (int)Math.sqrt(raiz); // esto es parecido (o igual) a parsear
        System.out.println("La raiz de " + aux1 + " es: " + raiz);
        
        
        //  si ingreso un valor entero que tenga raiz con decimales
        //  el valor que me muestra es el valor entero, incluso si el decimal es 
        //  mayor que 0.5, me lo reduce al numero anterior, pero nunca rebasa al entero, 
        //  o sea que, no lo redondea
        
        
        System.out.println("Elevar un numero a una potencia");
        double base, exponente, resultado;
        System.out.println("Ingrese el coeficiente");
        base = leer.nextDouble ();
        System.out.println("Ingrese el exponente");
        exponente = leer.nextDouble ();
        resultado = Math.pow(base, exponente);
        System.out.println("El numero " + base + " elevado a lapotencia " + exponente + " es: " + resultado + "\n");
        
        System.out.println("Redondear un numero");
        System.out.println("Redondear con double");
        double redon1 = 5.234, redon2 = 5.499, redon3 = 5.5, redon4 = 5.55;
        long numredon1 = Math.round(redon1);
        long numredon2 = Math.round(redon2);
        long numredon3 = Math.round(redon3);
        long numredon4 = Math.round(redon4);
        System.out.println("El numero " + redon1 + " redondeado da como resultado: " + numredon1);
        System.out.println("El numero " + redon2 + " redondeado da como resultado: " + numredon2);
        System.out.println("El numero " + redon3 + " redondeado da como resultado: " + numredon3);
        System.out.println("El numero " + redon4 + " redondeado da como resultado: " + numredon4);
        
        //el numero se redondea a partir de .5
         */
        System.out.println("Redondear con float");
        float uno = 4.1f, dos=  4.3f, tres = 4.5f, cuatro = 4.6f;
        int uno1 = Math.round(uno);
        int dos2 = Math.round(dos);
        int tres3 = Math.round(tres);
        int cuatro4 = Math.round(cuatro);
        System.out.println("El numero " + uno + " redondeado da como resultado: " + uno1);
        System.out.println("El numero " + dos + " redondeado da como resultado: " + dos2);
        System.out.println("El numero " + tres + " redondeado da como resultado: " + tres3);
        System.out.println("El numero " + cuatro + " redondeado da como resultado: " + cuatro4);
        
        //el numero en float tambien se redondea a partir del 0.5
        //-----------------------------------------------------------------------------------------------
       
        /*
        System.out.println("Numero aleatorio");
        double al1 = Math.random();
        int al2 = (int) (Math.random()*10);
        float al3 = (float) Math.random();
        System.out.println("El numero aleatorio double es: " + al1);
        System.out.println("El numero aleatorio int es: " + al2 );
        System.out.println("El numero aleatorio float es: " + al3);
        */
        
    }
    
}
