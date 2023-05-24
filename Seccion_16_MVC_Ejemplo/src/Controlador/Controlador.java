
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;
    
    public Controlador (Vista vista, Modelo modelo){
        
        this.vista = vista;
        this.modelo = modelo;
        vista.botonSuma.addActionListener(this);
        
    }
    
    public void iniciar (){
        
        vista.setTitle("Modelo vista controlador");
        vista.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    
        modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
        modelo.Sumar();
        
        vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
    
    }
    
}
