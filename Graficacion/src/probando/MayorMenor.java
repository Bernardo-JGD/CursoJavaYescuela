
package probando;

import java.util.Scanner;

public class MayorMenor {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int numeros[];
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros");
        cantidad = leer.nextInt();
        numeros = new int[cantidad];
        for (int i = 0; i<cantidad; i++){
            System.out.println("Ingrese el numero " + i);
            numeros[i] = leer.nextInt();
        }
        int auxiliar = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        while(auxiliar<cantidad-1){
            if(mayor<numeros[auxiliar+1]){
                mayor = numeros[auxiliar+1];     
            }
            if(menor>numeros[auxiliar+1]){
                menor = numeros[auxiliar+1];
            }
            auxiliar ++;   
        }
        System.out.println("Número mayor----" + mayor);
        System.out.println("Número menor----" + menor);
        
    }
    
}

/*

Import java.util.Scanner;//import mal escrito
public class Mayor Menor {//nombre clase
    public static void main(string[] args) {//String no string
        Scanner leer = new Scanner ();//System.in en parentesis
        int numeros[];
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros");
        cantidad = leer.nextInt();
        numeros = int[cantidad]; //falta el new 
        for (int i = 0; i<cantidad; i++){
            System.out.println("Ingrese el numero "  i);//el + de concatenar
            numeros[i] = leer.nextInt();
        }
        int auxiliar = 0;
        int mayor = numeros[0];
        int menor  numeros[0]; //falta signo de igual

        while(auxiliar<cantidad-1){
            if(mayor<numeros[auxiliar+1){//corchete cierre
                mayor = numeros[auxiliar+1];     
            }
            if(menor>numeros[auxiliar+1]){
                menor = numeros[auxiliar+1];
            //llave de cierre
            auxiliar +;//falta signo de más para incremento   
        }
        System.println("Número mayor----" + mayor);//falta el out
        System.out.println("Número menor----" + menor);       
    } 
}
*/

