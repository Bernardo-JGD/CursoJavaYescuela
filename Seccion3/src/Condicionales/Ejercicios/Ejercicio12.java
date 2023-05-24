package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {

        System.out.println("Pedir una calificacion de 0 a 10 y mostrarla de la foma");
        System.out.println("Insuficiente\n" + "Suficiente\n" + "Bien\n" + "Notable\n" + "Sobresaliente");

        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una calificacion"));

        if (nota >= 0 && nota <= 4) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else {
            if (nota == 5) {
                JOptionPane.showMessageDialog(null, "Suficiente");
            } else {
                if (nota == 6) {
                    JOptionPane.showMessageDialog(null, "Bien");
                } else {
                    if (nota == 7 || nota == 8) {
                        JOptionPane.showMessageDialog(null, "Notable");
                    }else{
                        if (nota >= 9 && nota<=10) {
                            JOptionPane.showMessageDialog(null, "Sobresaliente");
                        }else{
                            JOptionPane.showMessageDialog(null, "Fuera del rango");
                        }
                    }
                }
            }
        }

    }

}
