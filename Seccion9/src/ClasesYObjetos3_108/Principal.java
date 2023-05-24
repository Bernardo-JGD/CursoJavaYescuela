
package ClasesYObjetos3_108;

import javax.swing.JOptionPane;
public class Principal {
    
    public static void main (String args[]){
        
        Operacion op = new Operacion ();
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrar();
        
        
    }
    
}
