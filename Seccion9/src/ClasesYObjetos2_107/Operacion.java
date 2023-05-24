
package ClasesYObjetos2_107;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributos
    
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    //Metodo para pedirle al ususario que digite los numeros
    public void leer_numeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "));
    }
    public void sumar (){
        suma = numero1 + numero2;
    }
    public void restar (){
        resta = numero1 - numero2;
    }
    public void multiplicar (){
        multiplicacion = numero1 * numero2;
    }
    public void dividir (){
        division = numero1 / numero2;
    }
    public void mostrar_resultados (){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
}
