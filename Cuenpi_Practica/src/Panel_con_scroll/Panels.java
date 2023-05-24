
package Panel_con_scroll;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;

public class Panels extends JPanel {
    private JButton boton1, boton2;
    
    public Panels (){
        
        setLayout(null);
        setBackground (Color.CYAN);
        this.setPreferredSize(new Dimension (500, 700));
        iniciarComponentes ();
    }
    
    private void iniciarComponentes (){
        iniciarBotones ();
    }
    
    private void iniciarBotones (){
        boton1 = new JButton ("Boton arriba");
        boton1.setBounds(100, 100, 120, 50);
        add (boton1);
        
        boton2 = new JButton ("Boton abajo ");
        boton2.setBounds(150, 400, 120, 50);
        add(boton2);
    }
    
}
