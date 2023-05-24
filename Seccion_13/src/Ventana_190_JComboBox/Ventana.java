
package Ventana_190_JComboBox;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;


public class Ventana extends JFrame{
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
        colocarListasDesplegables ();
    }
    
    private void colocarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void colocarListasDesplegables (){
        String paises [] = {"Peru", "Colombia", "Paraguay", "Ecuador"};
        JComboBox listaDesplegable1 = new JComboBox(paises);
        listaDesplegable1.addItem("Argentina");//añade objetos a la lista
        listaDesplegable1.setSelectedItem("Paraguay");
        listaDesplegable1.setBounds(20, 20, 100, 30);
        panel.add(listaDesplegable1);
        
    }
    
}
