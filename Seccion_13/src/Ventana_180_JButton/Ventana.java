
package Ventana_180_JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ventana extends JFrame {
    
    public JPanel panel;
    
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles ();
        colocarBotones ();
    }
    
    private void colocarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void colocarBotones (){
        
        JButton boton1 = new JButton ("Boton1");
        boton1.setBounds (100, 100, 100, 40);
        panel.add(boton1);
        
        JButton boton2 = new JButton ();
        boton2.setText("Boton2");//establecemos texto al boton
        boton2.setBounds (220, 100, 100, 40);
        panel.add(boton2);
        
        JButton boton3 = new JButton ();
        boton3.setText("Boton3");
        boton3.setBounds(340, 100, 100, 40);
        boton3.setEnabled(false);//Habilitamos o deshabilitamos el boton 
        panel.add(boton3);
        
        JButton boton4 = new JButton ();
        boton4.setText("Boton4");
        boton4.setBounds(100, 160, 100, 40);
        boton4.setMnemonic('a');//establecemos que presionand alt + una_letra es como darle clic al boton
        boton4.setEnabled(true);
        panel.add(boton4);
        
        
        
    }
    
}
