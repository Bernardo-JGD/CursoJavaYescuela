
package Ventana_193_JTable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable (false);
        
        colocarComponentes ();
        
    }
    
    private void colocarComponentes (){
        colocarPaneles ();
        colocarTablas ();
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarTablas (){
        DefaultTableModel modelo = new DefaultTableModel ();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        
        String persona1[] = {"Bernardo", "21", "Pachoncito"};
        String persona2[] = {"Jacobo", "28", "Redondito"};
        String persona3[] = {"Ana", "56", "Almohadita"};
        String persona4[] = {"Perla", "45", "Ovalito"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        
        JTable tabla = new JTable (modelo);
        tabla.setBounds (20, 20, 300, 200);
        panel.add(tabla);
        
        JScrollPane scroll = new JScrollPane (tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
        
    }
    
}
