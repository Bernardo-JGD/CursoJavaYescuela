
package Ventana_175_JLabel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana (){
        setSize (500, 500);
        setLocationRelativeTo (null);
        setTitle ("Miaus :3");
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        iniciarComponentes ();
    }
    
    public void iniciarComponentes (){
        JPanel panel = new JPanel ();//creamos o declaramos un panel
        panel.setLayout(null);//desactivamos el diseño por defecto 
        getContentPane().add(panel);//agregamos el panel a la ventana
        JLabel etiqueta = new JLabel ();//declaro o creo una etiqueta 
        etiqueta.setText("Hola");//establecemos el texto de la etiqueta
        etiqueta.setBounds(100, 100, 30, 30);//establecemos la posicion y las dimensiones del etiqueta
        etiqueta.setForeground(Color.RED);//establecemos el color de la letra de la etiqueta
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta, damos permiso para cambiar el fondo
        etiqueta.setBackground(Color.BLACK);//cambiamos el color de fondo  de la etiqueta
        panel.add(etiqueta);
    }
    
}
