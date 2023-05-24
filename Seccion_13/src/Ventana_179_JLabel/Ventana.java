
package Ventana_179_JLabel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana (){
        
        setLayout(null);
        setSize (500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setResizable (false);
        iniciarComponentes ();
        
    }
    public void iniciarComponentes (){
        
        JPanel panel = new JPanel ();
        panel.setLayout(null);
        panel.setBounds(0, 30, 500, 470);
        getContentPane().add(panel);
        
        JLabel titulo = new JLabel ();
        titulo.setText("Pusheen :3");
        titulo.setBounds(200, 0, 120, 30);
        titulo.setForeground(Color.MAGENTA);
        titulo.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo);
        
        ImageIcon imagen = new ImageIcon ("Pusheen.png");
        JLabel etiqueta = new JLabel ();
        etiqueta.setBounds(0, 50 ,300 ,300);
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta);
        
        
    }
    
}
