
package insertargif;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
public class Insertargif extends JFrame{

    private JLabel imgmov;
    private ImageIcon g1, g2;
    
    public Insertargif (){
        
        setLayout(null);
        g1 = new ImageIcon (getClass().getResource("/Img/Pensando.gif"));
        g2 = new ImageIcon (g1.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
        
        
        
        
        imgmov = new JLabel ();
        imgmov.setBounds(200, 200, 100, 150);
        imgmov.setOpaque(true);
       // imgmov.setBackground(Color.yellow);
        imgmov.setIcon(g2);
        //imgmov.setIcon(new ImageIcon (g.getImage().getScaledInstance(imgmov.getWidth(), imgmov.getHeight(), Image.SCALE_SMOOTH)));
        add(imgmov);
        
        
        
        
        
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        setSize (500, 500);
        setResizable (false);
    }
    
    public static void main(String[] args) {
        Insertargif ig = new Insertargif ();
        ig.setVisible(true);
    }
    
}
