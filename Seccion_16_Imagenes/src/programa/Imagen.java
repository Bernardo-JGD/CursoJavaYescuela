
package programa;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class Imagen extends javax.swing.JPanel{
    
    private BufferedImage ruta;
    
    public Imagen (int ancho, int alto, BufferedImage ruta){
        
        this.setSize(ancho, alto);
        this.ruta = ruta;
    }
    
    public void paint (Graphics g){
        Dimension tam = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        //Image img = new ImageIcon(ruta).getImage();
        BufferedImage img = ruta;
        
        g.drawImage(img, 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
