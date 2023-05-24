
package Ventana_185_JToggleButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class Ventana extends JFrame{
    JPanel panel;
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    private void iniciarComponentes (){
        iniciarPaneles();
        colocarBotonesDeActivacion ();
    }
    
    private void iniciarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    private void colocarBotonesDeActivacion (){
        JToggleButton botonActivacion1 = new JToggleButton ("Opcion 1", false);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);
        
        JToggleButton botonActivacion2 = new JToggleButton ("Opcion 2", true);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);
        
        JToggleButton botonActivacion3 = new JToggleButton ("Opcion 3", true);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);
        
        ButtonGroup grupoBotonesActivados = new ButtonGroup ();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
        
    }
    
    
    
}
