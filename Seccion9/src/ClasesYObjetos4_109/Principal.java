
package ClasesYObjetos4_109;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String args[]){
        
        Operacion op = new Operacion ();
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multi = op.multiplicar(n1, n2);
        int divi = op.dividir(n1, n2);
        
        op.mostrar(suma, resta, multi, divi);
        
        System.out.println("");
        System.out.println("Otra forma mostrar es llamar al objeto dentro del sout");
        System.out.println("");
        System.out.println("El resultado de la suma es: " + op.sumar(n1, n2));
        System.out.println("El resultado de la resta es: " + op.restar(n1, n2));
        System.out.println("El resultado de la multiplicacion es: " + op.multiplicar(n1, n2));
        System.out.println("El resultado de la division es: " + op.dividir(n1, n2));
        
        
    }
    
}
