
package Ventana_186_JTextField;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    JPanel panel;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        
        colocarPaneles ();
        colocarCajasDeTexto ();
    }
    
    private void colocarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void colocarCajasDeTexto (){
        JTextField cajaTexto = new JTextField ();
        cajaTexto.setBounds(50, 100, 200, 30);
        cajaTexto.setText("What hongo?");
        System.out.println("Texto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
        
        JTextField cajaTexto2 = new JTextField ();
        cajaTexto2.setBounds(50, 150, 300, 50);
        cajaTexto2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panel.add(cajaTexto2);
        
        JTextField cajaTexto3 = new JTextField ();
        cajaTexto3.setBounds(50, 50, 200, 20);
        panel.add(cajaTexto3);
    }
       
}
