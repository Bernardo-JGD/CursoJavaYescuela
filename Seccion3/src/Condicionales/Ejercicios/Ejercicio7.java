package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        System.out.println("Pedir tres nueros y ordenarlos de mayor a menor");
        
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        
        if ((num1 > num2 && num2 > num3) && num1 > num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } else {
            if ((num1 > num2 && num1 < num3) && num2 < num3) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                if ((num1 < num2 && num1 < num3) && num2 > num3) {
                    System.out.println(num2 + ", " + num3 + ", " + num1);
                }else{
                    if ( (num1 > num2 && num1 > num3) && num2 < num3 ) {
                        System.out.println(num1 + ", " + num3 + ", " + num2);
                    }else{
                        if ( (num1 < num2 && num1 > num3) && num2 > num1 ) {
                            System.out.println(num2 + ", " + num1 + ", " + num3);
                        }else{
                            if ( (num1 < num2 && num1 < num3) && num2< num3 ) {
                                System.out.println(num3 + ", " + num2 + ", " + num1);
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
