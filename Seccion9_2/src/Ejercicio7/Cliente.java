
package Ejercicio7;

//-------------------------------------Hacer un programa sencillo para realizar gestiones en un banco 
//-------------------------------------para lo cual tendremos 2 clases (Cliente y cuenta). Considerar que un cliente 
//-------------------------------------se caracteriza por su nombre, apellido y DNI. El cliente puede consultar
//-------------------------------------saldo, asi como ingresar y retirar dinero de sus cuentas. Ademas cada cuenta
//-------------------------------------se caracteriza por un numero de cuenta y un saldo 
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuenta[];
    
    public Cliente (String nombre, String apellido, String dni, Cuenta cuenta[]){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuenta = cuenta;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public String getDni (){
        return dni;
    }
    public double Consultar_saldo (int n){
        return cuenta[n].getSaldo();
    }
    public void Ingresar_dinero (int n, double cantidad){
        cuenta[n].Ingresar_dinero(cantidad);
    }
    public void Retirar_dinero (int n, double cantidad){
        cuenta[n].Retirar_saldo(cantidad);
    }
}
