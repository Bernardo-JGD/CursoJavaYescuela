
package Ventana_194_JList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    
    private JPanel panel;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPaneles ();
        colocarListas ();
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarListas (){
        
        DefaultListModel modelo = new DefaultListModel ();
        
        modelo.addElement (new Persona ("Bernardo1", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo2", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo3", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo4", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo5", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo6", 21, "Pachoncito").getNombre());
        modelo.addElement (new Persona ("Bernardo7", 21, "Pachoncito").getNombre());
        
        JList lista = new JList (modelo);
        lista.setBounds(20, 20, 200, 100);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane (lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds (20, 20, 200, 100);
        panel.add(scroll);
        
    }
    
}
