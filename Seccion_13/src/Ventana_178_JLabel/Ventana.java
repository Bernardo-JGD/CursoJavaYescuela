
package Ventana_178_JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Ventana extends JFrame{
    
    public Ventana (){

        setSize (500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    public void iniciarComponentes (){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        
        JLabel titulo = new JLabel ();
        titulo.setText("Pusheen :3");
        titulo.setBounds(200, 0, 120, 30);
        titulo.setForeground(Color.MAGENTA);
        titulo.setFont(new Font ("Times New Roman", Font.ITALIC, 25));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);
        
        //forma 1
        //JLabel imagen = new JLabel (new ImageIcon ("Pusheen.png"));
        //imagen.setBounds(10, 30, 410, 487);
        //panel.add(imagen);
        
        //forma 2 
        //ImageIcon imagen = new ImageIcon ("Pusheen.png");
        //JLabel etiqueta = new JLabel (imagen);
        //etiqueta.setBounds(10, 30, 410, 487);
        //panel.add(etiqueta);
        
        JLabel etiqueta2 = new JLabel ();
        etiqueta2.setIcon(new ImageIcon ("Pusheen.png"));
        etiqueta2.setBounds(10, 30, 410, 487);
        panel.add(etiqueta2);
        
    }
    
}
