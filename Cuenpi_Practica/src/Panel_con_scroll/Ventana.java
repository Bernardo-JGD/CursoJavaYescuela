
package Panel_con_scroll;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Ventana extends JFrame{
    private JPanel panel_principal;
    Panels panel_prueba;
    JScrollPane scroll;
    
    public Ventana (){
        
        setSize(1366, 740);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        iniciarComponentes ();
        

    }
    
    private void iniciarComponentes (){
        
        colocarPaneles ();
        colocar_scrol_a_panel ();
    }
    
    private void colocarPaneles  (){
        
        panel_principal = new JPanel ();
        panel_principal.setLayout(null);
        panel_principal.setBackground(Color.BLACK);
        getContentPane().add(panel_principal);
        
    }
    
    private void colocar_scrol_a_panel (){
        panel_prueba = new Panels ();
        scroll = new JScrollPane ();
        scroll.setBounds(100, 200, 500, 300);
        scroll.setViewportView(panel_prueba);
        panel_principal.add(scroll);
        
    }
    
    
    
    
}
