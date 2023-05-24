
package medidas_de_textfield;


import javax.swing.*;

public class Medidas_De_TextField extends JFrame {

    private JTextField medida1, medida2, medida3, medida4, medida5, medida6;
    
    
    public Medidas_De_TextField (){
        
        setLayout (null);
        
        medida1 = new JTextField ("50,50-50x20");
        medida1.setBounds (50, 50, 50, 20);
        add(medida1);
        
        medida2 = new JTextField ("50,80-100x20");
        medida2.setBounds (50, 80, 100, 20);
        add(medida2);
        
        medida3 = new JTextField ("50,110-150x20");
        medida3.setBounds (50, 110, 150, 20);
        add(medida3);
        
        medida4 = new JTextField ("50,140-200x20");
        medida4.setBounds (50, 140, 200, 20);
        add(medida4);
        
        medida5 = new JTextField ("50,20-400x20-----------medida 5 ");
        medida5.setBounds (50, 20, 400, 20);
        add(medida5);
        
        medida6 = new JTextField ("50,170-400x20-----------medida 6 ");
        medida6.setBounds (50, 170, 400, 20);
        add(medida6);
        
        setSize (500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        
        Medidas_De_TextField m = new Medidas_De_TextField ();
        m.setVisible(true);
    }
    
}
