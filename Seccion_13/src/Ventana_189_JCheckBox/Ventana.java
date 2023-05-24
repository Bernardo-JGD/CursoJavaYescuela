
package Ventana_189_JCheckBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class Ventana extends JFrame {
    private JPanel panel;
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles ();
        colocarCasillasDeVerificacion ();
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarCasillasDeVerificacion (){
        
        JCheckBox casillaVerificacion1 = new JCheckBox ("Leche", true);        
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox ("Galletas");
        casillaVerificacion2.setEnabled(false);
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox ("Yogurth");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox ("Cereal");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
        
    }
    
    
    
}
