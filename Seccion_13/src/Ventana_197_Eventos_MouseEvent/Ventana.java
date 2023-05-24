
package Ventana_197_Eventos_MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame{
    
    private JPanel panel;
    private JTextArea areaTexto;
    private JButton boton;
    
    public Ventana (){
        
        setSize (500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPaneles ();
        colocarAreaDeTexto ();
        colocarBoton ();
        
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarAreaDeTexto (){
        areaTexto = new JTextArea ();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }
    
    private void colocarBoton (){
        
         boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        //eventoOyenteDeAccion ();
        eventoOyenteDeRaton();
        
    }
    private void eventoOyenteDeRaton() {

        //Agregando oyente de Raton 
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                if (me.isAltDown ()) {
                    areaTexto.append("Alt\n");
                }else{
                    if (me.isControlDown()) {
                        areaTexto.append("Control\n");
                    }else{
                        if (me.isShiftDown()) {
                            areaTexto.append("Shift\n");
                        }else{
                            if (me.isMetaDown()) {
                                areaTexto.append("Click Derecho\n");
                            }else{
                                areaTexto.append("Click Izquierdo\n");
                            }
                        }
                    }
                }
                if ((me.getClickCount()) == 2) {
                    areaTexto.append("Doble click izquierdo\n");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
               // areaTexto.append("mouseExited\n");
            }

        };

        boton.addMouseListener(oyenteDeRaton);

    }

}
