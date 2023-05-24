
package Polimorfismo_134_Trabaja_con_Herencia;


public class Vehiculo {
    
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo (String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMatricula (){
        return matricula;
    }
    public String getMarca (){
        return marca;
    }
    public String modelo (){
        return modelo;
    }
   
    public String mostrarDatos (){
        return "Matricula: " + matricula 
                + "\nMarca: " + marca 
                + "\nModelo: " + modelo + "\n";
    }
    
}
