
package Ventana_173_JLabel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana (){
     
        setSize (500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setBackground(Color.BLUE);
        iniciarComponentes ();
    }
    
    public void iniciarComponentes (){
        JPanel panel = new JPanel ();
        panel.setBackground(Color.GREEN);
        getContentPane().add(panel);
    }
    
}
