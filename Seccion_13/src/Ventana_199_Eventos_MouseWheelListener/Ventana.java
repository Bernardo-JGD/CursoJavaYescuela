
package Ventana_199_Eventos_MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame {

    private JPanel panel;
    private JTextArea areaTexto;
    
    public Ventana() {

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        colocarPaneles();
        eventosRuedaDelRaton();
        colocarAreaTexto ();

    }

    private void colocarPaneles() {

        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

    }
    
    private void colocarAreaTexto (){
        
        areaTexto = new JTextArea ();
        areaTexto.setBounds (20, 20, 200, 300);
        panel.add(areaTexto);
        
        JScrollPane scroll = new JScrollPane (areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds (20, 20, 200, 300);
        panel.add(scroll);
        
    }

    private void eventosRuedaDelRaton() {

        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            
            @Override
            public void mouseWheelMoved (MouseWheelEvent mwe){
                
                if ( mwe.getPreciseWheelRotation() == -1) {
                    areaTexto.append("Rueda hacia arriba\n");
                }
                if (mwe.getPreciseWheelRotation() == 1) {
                    areaTexto.append("Rueda hacia abajo\n");
                }
                
            }

        };

        panel.addMouseWheelListener(ruedaRaton);

    }

}
