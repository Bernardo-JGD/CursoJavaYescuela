
package Ventana_191_DefaultComboBoxModel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles ();
        colocarListasDesplegables ();
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel();
        panel.setLayout (null);
        getContentPane().add(panel);
        
    }
    
    private void colocarListasDesplegables (){
        
        Persona persona1 = new Persona ("Bernardo", 21, "Pachoncito");
        Persona persona2 = new Persona ("J", 28, "Redondito");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel ();
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        
        JComboBox listaDesplegable = new JComboBox (modelo);
        listaDesplegable.setBounds (20, 20, 200, 30);
        panel.add(listaDesplegable);
        
    }
    
    
}
