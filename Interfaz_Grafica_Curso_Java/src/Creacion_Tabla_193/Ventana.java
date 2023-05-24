
package Creacion_Tabla_193;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame {
    
    
    private JLabel titulo;
    private JPanel panelp;
    public Ventana(){
        
        
        
        panelprincipal();
        etiquetatitulo();
        colocartablas();
        colocarlistas();
        
        
        setSize (500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void panelprincipal(){
        
        panelp= new JPanel ();
        panelp.setBounds(0, 0, 500, 500);
        panelp.setBackground(Color.LIGHT_GRAY);
        panelp.setLayout(null);
        getContentPane().add(panelp);
        
        
    }
    
    public void etiquetatitulo (){
        
        titulo = new JLabel();
        titulo.setBounds(200, 10, 100, 30);
        titulo.setForeground(Color.yellow);
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Creacion de una tabla");
        /*
         en el metodo donde cree un boton, label, o algo así
         tengo que agregarlo ahi mismo al panel 
         como se ve a continuacion 
         y aparte tengo que poner este metodo dentro del constructor por defecto de la clase 
         para que lo detecte y lo pueda agregar 
        */
        panelp.add(titulo);
    }
    private void colocartablas(){
        // tenemos que crear un objeto de tipo: DefaultTableModel
        DefaultTableModel modelo = new DefaultTableModel ();
        //agrego columnas a la tabla 
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        //agrego filas a la tabla 
        String personas1 [] = {"Bernardo", "20", "MexiJapo"};
        String personas2 [] = {"Jacobo", "28", "JapoTaku"};
        String personas3 [] = {"505", "88", "Pachoncito"};
        String personas4 [] = {"Tortuga", "45", "Moon"};
        String personas5 [] = {"Marcus", "50", "Hera"};
        String personas6 [] = {"Raynor", "42", "Terran"};
        String personas7 [] = {"Panda", "55", "Japo"};
        
        //repito :v 
        String personas8 [] = {"Bernardo", "20", "MexiJapo"};
        String personas9 [] = {"Jacobo", "28", "JapoTaku"};
        String personas10 [] = {"505", "88", "Pachoncit00000000000000000000000000000"};
        String personas11[] = {"Tortuga", "45", "Moon"};
        String personas12 [] = {"Marcus", "50", "Hera"};
        String personas13 [] = {"Raynor", "42", "Terran"};
        String personas14 [] = {"Panda", "55", "Japo"};
        
        modelo.addRow(personas1);
        modelo.addRow(personas2);
        modelo.addRow(personas3);
        modelo.addRow(personas4);
        modelo.addRow(personas5);
        modelo.addRow(personas6);
        modelo.addRow(personas7);
        
        modelo.addRow(personas8);
        modelo.addRow(personas9);
        modelo.addRow(personas10);
        modelo.addRow(personas11);
        modelo.addRow(personas12);
        modelo.addRow(personas13);
        modelo.addRow(personas14);

        
        
        // y crear un objeto de tipo: JTable 
        JTable tabla = new JTable(modelo);
        // se establece la posicion y el tamaño 
        tabla.setBounds(25, 50, 300, 200);
        panelp.add(tabla);
        //tengo que agregar un JScrollPane
        //lo tengo que importar import javax.swing.JScrollPane;
        // es la barrita de desplzamiento que está a la derecha o abajo cuando hay mucha informacion
        // 
        JScrollPane scroll = new JScrollPane (tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(25, 50, 300, 200);
        panelp.add(scroll);
    }
    //creacion de listas 
    public void colocarlistas(){
        // necesito este crear un objeto de tipo DefaultListModel para crear la lista 
        // y tengo que importar import javax.swing.DefaultListModel
        DefaultListModel modelo = new DefaultListModel ();
        
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        modelo.addElement("Elemento 1 ");
        
        //creo un objeto de tipo JList
        //e importo import javax.swing.JList;
        JList lista = new JList(modelo);
        lista.setBounds(25, 250, 200, 100);
        panelp.add(lista);
        
        
        JScrollPane scroll = new JScrollPane (lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(25, 250, 200, 100);
        panelp.add(scroll);
    }
    
    
}
