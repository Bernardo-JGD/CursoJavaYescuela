
package Ventana_184_JRadioButton;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Ventana extends JFrame{
    JPanel panel;
    public Ventana (){
        
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    private void iniciarComponentes (){
        
        iniciarPaneles();
        colocarRadioBotones();
        
    }
    private void iniciarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    private void colocarRadioBotones (){
        JRadioButton radioBoton1 = new JRadioButton ("Opcion 1", true);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setText("Programacion");  
        radioBoton1.setFont(new Font("coop black", Font.BOLD, 20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton ("Opcion 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);
        radioBoton2.setEnabled(false);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton ("Opcion 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup ();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        
    }
    
    
    
    
}
