package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.println("Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. ");
        System.out.println("Con meses de 28, 30 y 31 dias. Sin años bisiestos");

        int dia, mes, year;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if (year != 0) {
            if ((mes == 2) && (dia >= 1 && dia <= 28)) {
                JOptionPane.showMessageDialog(null, "Fecha " + dia + "/" + mes + "/" + year + " correcta");
            } else {
                if ((mes == 4 || mes == 6 || mes == 11 || mes == 9) && (dia >= 1 && dia <= 30)) {
                    JOptionPane.showMessageDialog(null, "Fecha " + dia + "/" + mes + "/" + year + " correcta");
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
                        JOptionPane.showMessageDialog(null, "Fecha " + dia + "/" + mes + "/" + year + " correcta");
                    }else{
                        JOptionPane.showMessageDialog(null, "Fecha incorrecta");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta por el año");
        }
    }

}
