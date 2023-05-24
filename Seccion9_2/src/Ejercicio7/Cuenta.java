package Ejercicio7;

public class Cuenta {

    private int numero_cuenta;
    private double saldo;

    public Cuenta(int numero_cuenta, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Ingresar_dinero(double cantidad) {

        saldo = saldo + cantidad;

    }
    public void Retirar_saldo (double cantidad){
        saldo = saldo - cantidad;
    }

}
