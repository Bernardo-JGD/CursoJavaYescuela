
package pruebas_proyecto;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Pruebas_Proyecto extends JFrame {
    private JPanel panelp;
    private JButton boton_probar;

    public static void main(String[] args) {
        Pruebas_Proyecto pp = new Pruebas_Proyecto();
        
        pp.setVisible(true);
        
    }
    
    public Pruebas_Proyecto (){
        
        setSize (1300, 750);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    
    public void iniciarComponentes (){
        
        iniciarPaneles ();
        iniciarBotones ();
    }
    
    public void iniciarPaneles (){
        panelp = new JPanel ();
        panelp.setLayout(null);
        getContentPane().add(panelp);
    }
    
    public void iniciarBotones (){
        
        ImageIcon clientes = new ImageIcon ("Clientes.png");
        
        boton_probar = new JButton ();
        boton_probar.setBounds (100, 200, 200, 200);
        boton_probar.setIcon(new ImageIcon (clientes.getImage().getScaledInstance(boton_probar.getWidth() ,boton_probar.getHeight(), Image.SCALE_SMOOTH)));
        boton_probar.setOpaque(false);
        panelp.add(boton_probar);
    }
    
    
}
