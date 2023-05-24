
package Ventana_182_JButton;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
public class Ventana extends JFrame {
    
    private JPanel panel;
    
    public Ventana (){
        
        setSize (500, 500);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    private void iniciarComponentes (){
        iniciarPaneles();
        iniciarBotones ();
    }
    
    private void iniciarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    public void iniciarBotones (){
        
        //boton 1 - boton de texto
        JButton boton1 = new JButton ();
        boton1.setText("Boton1");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//para habilitar o deshabilitar el boton
        boton1.setMnemonic('a');//para dar clic al boton presionand0 alt + una_letra
        boton1.setForeground(Color.BLUE);//establecemos el color para la letra del boton
        boton1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(boton1);
        
        //boton2 - boton de imagen
        ImageIcon clientes = new ImageIcon ("Clientes.png");
        JButton boton2 = new JButton ();
        boton2.setBounds(100, 200, 200, 200);
        boton2.setOpaque(false);
        boton2.setBackground(new Color(0, 0, 0));
        boton2.setIcon (new ImageIcon(clientes.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
        
    }
    
}
