
package Ventana_192_JPasswordField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Ventana extends JFrame {
    private JPanel panel;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        colocarPaneles ();
        colocarCampoDeContraseña ();
    }
    
    private void colocarPaneles (){
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void colocarCampoDeContraseña (){
        
        JPasswordField campoContraseña = new JPasswordField ();
        campoContraseña.setBounds(20, 20, 150, 30);
        campoContraseña.setText("Programacion");
        panel.add(campoContraseña);
        
        String contraseña = "";
        for (int i = 0; i < campoContraseña.getPassword().length; i++) {
            contraseña += campoContraseña.getPassword()[i];
        }
        
        System.out.println("Contraseña: " + contraseña);
    }
    
}
