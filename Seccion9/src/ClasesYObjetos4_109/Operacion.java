
package ClasesYObjetos4_109;


public class Operacion {
 
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    public int restar (int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    public int multiplicar (int numero1, int numero2){
        int multi = numero1 * numero2;
        return multi;
    }
    public int dividir (int numero1, int numero2){
        int divi = numero1 / numero2;
        return divi;
    }
    
    public void mostrar (int suma, int resta, int multiplicacion, int division){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
    
}
