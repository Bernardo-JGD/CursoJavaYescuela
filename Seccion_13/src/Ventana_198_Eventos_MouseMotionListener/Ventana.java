
package Ventana_198_Eventos_MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame {
    
    private JPanel panel;
    private JTextArea areaTexto;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPaneles ();
        eventoDeMovimientoRaton ();
        colocarAreaTexto ();
        
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
               
        
    }
    
    private void colocarAreaTexto (){
        
        areaTexto = new  JTextArea ();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
        
        JScrollPane scroll = new JScrollPane (areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds (20, 20, 200, 300);
        panel.add(scroll);
        
    }
    
    private void eventoDeMovimientoRaton (){
        
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener (){
        
            @Override 
            public void mouseDragged (MouseEvent me){
                areaTexto.append("mouseDragged\n");
            }
            
            @Override
            public void mouseMoved (MouseEvent me){
                areaTexto.append("mouseMoved\n");
            }
            
        
        };
        
        panel.addMouseMotionListener(oyenteMovimientoRaton);
        
    }
    
}
