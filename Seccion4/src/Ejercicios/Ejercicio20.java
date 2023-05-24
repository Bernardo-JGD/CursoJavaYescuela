package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {

        System.out.println("Pedir un numero N, introducir N sueldos y mostrar el sueldo maximo");

        int N;
        double sueldoleer = 0, auxmax = 0;

        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a pedir"));

        for (int i = 1; i <= N; i++) {
            sueldoleer = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo " + i));

            if (sueldoleer > auxmax) {
                auxmax = sueldoleer;
            }

        }
        JOptionPane.showMessageDialog(null, "El sueldo maximo es--- " + auxmax);

    }

}
