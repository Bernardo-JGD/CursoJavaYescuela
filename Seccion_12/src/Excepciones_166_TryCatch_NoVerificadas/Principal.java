package Excepciones_166_TryCatch_NoVerificadas;

import javax.swing.JOptionPane;

public class Principal {

    public void operaciones() {

        int num1 = 5, num2 = 0, resultado;
        resultado = num1 / num2;

    }

    public void operaciones2() {
        try{
        operaciones();
        }catch (ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Division entre cero");
        }
        System.out.println("Programa terminado");
    }

    public static void main(String[] args) {

        Principal p = new Principal ();
        p.operaciones2();
        
    }

}
