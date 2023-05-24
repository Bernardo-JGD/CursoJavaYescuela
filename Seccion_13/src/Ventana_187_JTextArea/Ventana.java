
package Ventana_187_JTextArea;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana (){
        
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles();
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
        areaTexto.setText("Escriba >:D!!!");
        areaTexto.append("\nTambien aqui >:D!!!");//añade mas texto
        areaTexto.setEditable(true);//permite editar o no el area de texto (true/false)
        System.out.println("Area de texto: " + areaTexto.getText());
        panel.add(areaTexto);
    }
    
}
