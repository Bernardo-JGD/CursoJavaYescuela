
package ClasesYObjetos3_108;

public class Operacion {
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void sumar (int numero1, int numero2){
        suma = numero1 + numero2;
    }
    public void restar (int numero1, int numero2){
        resta = numero1 - numero2;
    }
    public void multiplicar (int numero1, int numero2){
        multiplicacion = numero1 *numero2;
    }
    public void dividir (int numero1, int numero2){
        division = numero1/numero2;
    }
    
    public void mostrar (){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
    }
    
}
