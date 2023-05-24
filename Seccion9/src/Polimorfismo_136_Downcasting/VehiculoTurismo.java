
package Polimorfismo_136_Downcasting;


public class VehiculoTurismo extends Vehiculo{
    
    private int nPuertas;
    
    public VehiculoTurismo (String matricula, String marca, String modelo, int nPuertas){
        super (matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    public int getnPuertas (){
        return nPuertas;
    }
    @Override
    public String mostrarDatos (){
        return "Matricula: " + matricula 
                + "\nMarca: " + marca 
                + "\nModelo: " + modelo 
                + "\nNumero puertas: " + nPuertas + "\n";
    }
    
}

