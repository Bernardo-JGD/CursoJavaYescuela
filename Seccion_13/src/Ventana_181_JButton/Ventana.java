
package Ventana_181_JButton;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        
        JButton boton1 = new JButton ();
        boton1.setText("Boton1");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//para habilitar o deshabilitar el boton
        boton1.setMnemonic('a');//para dar clic al boton presionand alt + una_letra
        boton1.setForeground(Color.BLUE);//establecemos el color para la letra del boton
        boton1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(boton1);
        
    }
    
}
