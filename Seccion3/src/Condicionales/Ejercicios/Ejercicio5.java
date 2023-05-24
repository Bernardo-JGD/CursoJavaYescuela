
package Condicionales.Ejercicios;


import javax.swing.JOptionPane;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        System.out.println("Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: ");
        System.out.println("** si trabaja 40 horas o menos se le paga $16 por hora ");
        System.out.println("** si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por ");
        System.out.println("cada hora extra");
        
        double horastrabajadas, aux1, aux2, hextra, sueldoextratotal;
        horastrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la horas trabajadas"));
        aux1 = horastrabajadas;
        if (horastrabajadas<=40) {
            horastrabajadas = horastrabajadas*16;
            JOptionPane.showMessageDialog(null, "Su sueldo por trabajar " + aux1 + " es--- " + horastrabajadas + "\nno hubo horas extras");
        }else{
            if (horastrabajadas>40) {
                hextra = horastrabajadas - 40;
                aux2 = hextra;
                hextra = hextra*20;
                horastrabajadas = 40*16;
                sueldoextratotal = hextra + horastrabajadas;
                JOptionPane.showMessageDialog(null, "Trabajo " + aux1 + " horas en total" + "\nde las cuales " + aux2 + " fueron extra"
                 + "\n"
                 + "Sueldo base--- $" + horastrabajadas + "\n"
                 + "Sueldo por horas extra--- $" + hextra  + "\n"
                 + "Sueldo total--- $" + sueldoextratotal);
                
            }
        }
        
        
    }
    
}
