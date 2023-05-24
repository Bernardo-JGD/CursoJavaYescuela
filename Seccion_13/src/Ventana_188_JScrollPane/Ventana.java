
package Ventana_188_JScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles ();
        colocarAreasDeTexto ();
    }
    
    private void colocarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void colocarAreasDeTexto (){
        JTextArea areaTexto = new JTextArea ();
        areaTexto.setBounds(20, 20, 300, 200);
        panel.add(areaTexto);
        
        //Barras de desplazamiento
        JScrollPane barraDesplazamiento = new JScrollPane(areaTexto);
        barraDesplazamiento.setBounds(20, 20, 300, 200);
        barraDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barraDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barraDesplazamiento);
        
        JTextArea areaTexto2 = new JTextArea();
        areaTexto2.setBounds(20, 250, 300, 200);
        panel.add(areaTexto2);
        
        JScrollPane barraDesplazamiento2 = new JScrollPane(areaTexto2, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraDesplazamiento2.setBounds(20, 250, 300, 200);
        panel.add(barraDesplazamiento2);
    }
    
    
    
}
