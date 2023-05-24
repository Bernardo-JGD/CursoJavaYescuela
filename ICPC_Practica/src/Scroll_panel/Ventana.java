package Scroll_panel;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame {

    private JPanel panel;
    private JButton boton1, boton2;
    

    public Ventana() {

        setSize(1366, 740);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        iniciarComponentes();

    }

    private void iniciarComponentes() {
        colocarPaneles();
        
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLocation(100, 200);
        panel.setPreferredSize(new Dimension(650, 450));
        //panel.setBounds(100, 200, 650, 450);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        JScrollPane scroll_panel_añadir = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll_panel_añadir.setBounds(100, 200, 650, 450);
        add(scroll_panel_añadir);
        
        // scroll_panel_añadir.setViewportView(panel);
        // add(scroll_panel_añadir);
        
        getContentPane().add(panel);
        colocarBotones();
    }

    private void colocarBotones() {
        boton1 = new JButton("Boton arriba");
        boton1.setBounds(100, 100, 120, 50);
        panel.add(boton1);

        boton2 = new JButton("Boton abajo");
        boton2.setBounds(100, 500, 120, 50);
        panel.add(boton2);

    }

}
