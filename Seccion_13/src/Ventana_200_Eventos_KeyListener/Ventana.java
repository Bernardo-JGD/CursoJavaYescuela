package Ventana_200_Eventos_KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Ventana extends JFrame {

    private JPanel panel;
    private JTextArea areaTexto;
    private JTextField cajaTexto;

    public Ventana() {

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        iniciarComponentes();

    }

    private void iniciarComponentes() {
        
        colocarPaneles ();
        colocarAreaTexto ();
        colocarCajaTexto ();
        
    }

    private void colocarPaneles() {

        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

    }

    private void colocarCajaTexto() {
        
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        panel.add(cajaTexto);
        
        eventosDelTeclado ();

    }
    
    private void colocarAreaTexto (){
        
        areaTexto = new JTextArea ();
        areaTexto.setBounds (230, 30, 200, 300);
        panel.add(areaTexto);
        
        JScrollPane scroll = new JScrollPane (areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230, 30, 200, 300);
        panel.add(scroll);
        
    }
    
    private void eventosDelTeclado (){
        
        KeyListener eventoTeclado = new KeyListener (){
        
            @Override 
            public void keyTyped (KeyEvent ke){
                //solo acepta unicoda, alt, shift, no, por ejemplo, signos y numeros si 
                //areaTexto.append("keyTyped\n");
            }
            
            @Override 
            public void keyPressed (KeyEvent ke){
                //este es con todas las teclas y es al presionar 
                //areaTexto.append("keyPressed\n");
            }
            
            @Override 
            public void keyReleased (KeyEvent ke){
                // para este presionas, mantienes y detecta una vez 
                //areaTexto.append("keyReleased\n");
                
                if (ke.getKeyChar() == 'p') {
                    areaTexto.append("Letra p\n");
                }
                if (ke.getKeyChar() == '\n') {
                    areaTexto.append("Enter \n");
                }
                if (ke.getKeyChar() == ' ') {
                    areaTexto.append("Espacio \n");
                }
            }
            
        
        };
        
        
        cajaTexto.addKeyListener(eventoTeclado);
        
    }
    
    

}
