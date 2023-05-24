
package Ventana_176_JLabel;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
        JLabel etiqueta = new JLabel ("Centro", SwingConstants.CENTER);//declaro o creo una etiqueta 
        JLabel etiqueta2 = new JLabel ("Izquierda", SwingConstants.LEFT);
        JLabel etiqueta3 = new JLabel ("Derecha", SwingConstants.RIGHT);
        JLabel etiqueta4 = new JLabel();
        JLabel etiqueta5 = new JLabel();
        JLabel etiqueta6 = new JLabel();
        //etiqueta.setText("Hola");//establecemos el texto de la etiqueta
        etiqueta.setBounds(100, 100, 50, 30);//establecemos la posicion y las dimensiones del etiqueta
        etiqueta2.setBounds(150, 150, 100, 30);
        etiqueta3.setBounds(200, 200, 100, 30);
        etiqueta4.setBounds(200, 100, 100, 30);
        etiqueta5.setBounds(250, 250, 100, 30);
        etiqueta6.setBounds(300, 300, 100, 30);
        etiqueta.setForeground(Color.RED);//establecemos el color de la letra de la etiqueta
        etiqueta2.setForeground(Color.RED);
        etiqueta3.setForeground(Color.RED);
        etiqueta4.setForeground(Color.CYAN);
        etiqueta5.setForeground(Color.CYAN);
        etiqueta6.setForeground(Color.CYAN);
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta, damos permiso para cambiar el fondo
        etiqueta2.setOpaque(true);
        etiqueta3.setOpaque(true);
        etiqueta4.setOpaque(true);
        etiqueta5.setOpaque(true);
        etiqueta6.setOpaque(true);
        etiqueta.setBackground(Color.BLACK);//cambiamos el color de fondo  de la etiqueta
        etiqueta2.setBackground(Color.BLACK);
        etiqueta3.setBackground(Color.BLACK);
        etiqueta4.setBackground(Color.BLACK);
        etiqueta5.setBackground(Color.BLACK);
        etiqueta6.setBackground(Color.BLACK);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);//establecemos la alineacion horizontal del texto
        etiqueta5.setHorizontalAlignment (SwingConstants.LEFT);
        etiqueta6.setHorizontalAlignment(SwingConstants.RIGHT);
        etiqueta4.setText("Centro");
        etiqueta5.setText("Izquierda");
        etiqueta6.setText("Derecha");
        
        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        panel.add(etiqueta6);
    }
}