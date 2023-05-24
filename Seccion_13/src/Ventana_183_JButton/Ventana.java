
package Ventana_183_JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.BorderFactory;

public class Ventana extends JFrame {
    
    private JPanel panel;
    
    public Ventana (){
        
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    public void iniciarComponentes (){
        
        iniciarPaneles ();
        iniciarBotones ();
    }
    
    public void iniciarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    public void iniciarBotones (){
        
        //Boton1 - boton de texto
        JButton boton1 = new JButton ();
        boton1.setText("Boton1");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//para habilitar o deshabilitar el boton
        boton1.setMnemonic('a');//para dar clic al boton presionand alt + a
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(boton1);
        
        //Boton 2 - boton de imagen
        ImageIcon clientes = new ImageIcon ("Clientes.png");
        JButton boton2 = new JButton ();
        boton2.setBounds(100, 150, 100, 100);
        //con los siguientes dos metodos hago que el fondo del boton sea transparente
        boton2.setOpaque(false);
        boton2.setBackground(new Color(0, 0, 0));
        //---------------------------------------------------------------------------------
        boton2.setIcon(new ImageIcon (clientes.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
        
        //Boton 3 - boton de borde (1 parametro, color)
        JButton boton3 = new JButton ();
        boton3.setBounds(220, 100, 100, 40);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        panel.add(boton3);
        
        //Boton4 - boton de borde (2 parametros, color, grosor
        JButton boton4 = new JButton ();
        boton4.setBounds(220, 150, 100, 40);
        boton4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 4));
        panel.add(boton4);
        
        //Boton 5 - boton de borde (3 parametros, color, tamaño, redondeo si/no)
        JButton boton5 = new JButton ();
        boton5.setBounds(220, 200, 150, 100);
        boton5.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 180), 3, true));
        panel.add(boton5);
    }
    
    
}
