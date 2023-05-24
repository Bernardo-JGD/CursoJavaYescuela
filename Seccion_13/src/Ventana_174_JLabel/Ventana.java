
package Ventana_174_JLabel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ventana extends JFrame{
    
    public Ventana (){
        
        setSize (500, 500);
        setTitle ("Miaus :3");
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        iniciarComponentes ();
        
    }
    
    public void iniciarComponentes (){
        
        JPanel panel = new JPanel ();//creamos o declaramos un panel
        panel.setLayout(null);//desactivamos el diseño por defecto 
        getContentPane().add(panel);//agregamos el panel a la ventana
        JLabel etiqueta = new JLabel ();//declaro o creo una etiqueta 
        etiqueta.setText("Hola");//establecemos el texto de la etiqueta
        etiqueta.setBounds(100, 100, 50, 30);
        panel.add(etiqueta);
        
    }
    
}
