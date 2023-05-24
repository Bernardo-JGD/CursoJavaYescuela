/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo_136_Downcasting;

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
