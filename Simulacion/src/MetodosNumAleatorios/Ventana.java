package MetodosNumAleatorios;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    private JPanel panel_principal;
    private JLabel titulo;
    private JButton boton_cuadrados_medios;
    private JButton boton_productos_medios;
    private JButton boton_multi_constante;
    private JButton boton_algortimo_lineal;
    private JButton boton_congru_multi;
    private JButton boton_congru_adi;

    private JPanel panel_cuadrados_medios;
    private JPanel panel_cuadrados_medios_resultados;
    private JLabel ingresar_semilla1;
    private JLabel ingresar_iteraciones1;
    private JTextField recibir_semilla1;
    private JTextField recibir_iteraciones1;
    static double cuadrados_medios_ri[];
    static int cuadrados_medios_x[];
    static JLabel medios_mostrar[];

    private JPanel panel_productos_medios;
    private JPanel panel_multi_constante;
    private JPanel panel_algoritmo_lineal;
    private JPanel panel_congru_multi;
    private JPanel panel_congru_adi;

    private JButton regresar1, regresar2, regresar3, regresar4, regresar5, regresar6;
    private JButton calcular1, calcular2, calcular3, calcular4, calcular5, calcular6;

    public Ventana() {
        setLayout(null);

        panel_principal = new JPanel();
        panel_principal.setLayout(null);
        panel_principal.setBounds(50, 25, 600, 600);
        panel_principal.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_principal);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Generacion de Numeros Pseudoaleatorios");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.YELLOW);
        titulo.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        panel_principal.add(titulo);

        boton_cuadrados_medios = new JButton("Algoritmo de Cuadrados Medios");
        boton_cuadrados_medios.setBounds(25, 100, 550, 50);
        boton_cuadrados_medios.setBackground(Color.GREEN);
        boton_cuadrados_medios.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_cuadrados_medios.setForeground(Color.BLACK);
        boton_cuadrados_medios.addActionListener(this);
        panel_principal.add(boton_cuadrados_medios);

        boton_productos_medios = new JButton("Algoritmo de Productos Medios");
        boton_productos_medios.setBounds(25, 175, 550, 50);
        boton_productos_medios.setBackground(Color.CYAN);
        boton_productos_medios.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_productos_medios.setForeground(Color.BLACK);
        boton_productos_medios.addActionListener(this);
        panel_principal.add(boton_productos_medios);

        boton_multi_constante = new JButton("Algoritmo de Multiplicador Constante");
        boton_multi_constante.setBounds(25, 250, 550, 50);
        boton_multi_constante.setBackground(Color.PINK);
        boton_multi_constante.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_multi_constante.setForeground(Color.BLACK);
        boton_multi_constante.addActionListener(this);
        panel_principal.add(boton_multi_constante);

        boton_algortimo_lineal = new JButton("Algoritmo Lineal");
        boton_algortimo_lineal.setBounds(25, 325, 550, 50);
        boton_algortimo_lineal.setBackground(Color.ORANGE);
        boton_algortimo_lineal.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_algortimo_lineal.setForeground(Color.BLACK);
        boton_algortimo_lineal.addActionListener(this);
        panel_principal.add(boton_algortimo_lineal);

        boton_congru_multi = new JButton("Algoritmo Congruencial Multiplicativo");
        boton_congru_multi.setBounds(25, 400, 550, 50);
        boton_congru_multi.setBackground(Color.YELLOW);
        boton_congru_multi.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_congru_multi.setForeground(Color.BLACK);
        boton_congru_multi.addActionListener(this);
        panel_principal.add(boton_congru_multi);

        boton_congru_adi = new JButton("Algoritmo Congruencial Aditivo");
        boton_congru_adi.setBounds(25, 475, 550, 50);
        boton_congru_adi.setBackground(Color.RED);
        boton_congru_adi.setForeground(Color.BLACK);
        boton_congru_adi.setFont(new Font("Verdana", Font.BOLD, 20));
        boton_congru_adi.addActionListener(this);
        panel_principal.add(boton_congru_adi);

        //----------------------------------------------------------------------
        panel_cuadrados_medios = new JPanel();
        panel_cuadrados_medios.setLayout(null);
        panel_cuadrados_medios.setBounds(50, 25, 600, 600);
        panel_cuadrados_medios.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_cuadrados_medios);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo de Cuadrados Medios");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.GREEN);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_cuadrados_medios.add(titulo);

        regresar1 = new JButton("Regresasr al menu");
        regresar1.setBounds(25, 520, 250, 50);
        regresar1.setBackground(Color.GREEN);
        regresar1.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar1.setForeground(Color.BLACK);
        regresar1.addActionListener(this);
        panel_cuadrados_medios.add(regresar1);

        ingresar_semilla1 = new JLabel("Ingrese la semilla D");
        ingresar_semilla1.setBounds(25, 100, 200, 30);
        ingresar_semilla1.setForeground(Color.WHITE);
        ingresar_semilla1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_cuadrados_medios.add(ingresar_semilla1);

        recibir_semilla1 = new JTextField();
        recibir_semilla1.setBounds(25, 150, 100, 30);
        panel_cuadrados_medios.add(recibir_semilla1);
        recibir_semilla1.setVisible(false);
        
        ingresar_iteraciones1 = new JLabel("Ingrese las iteraciones");
        ingresar_iteraciones1.setBounds(25, 200, 200, 30);
        ingresar_iteraciones1.setForeground(Color.WHITE);
        ingresar_iteraciones1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_cuadrados_medios.add(ingresar_iteraciones1);

        recibir_iteraciones1 = new JTextField();
        recibir_iteraciones1.setBounds(25, 250, 100, 30);
        panel_cuadrados_medios.add(recibir_iteraciones1);
        recibir_iteraciones1.setVisible(false);
        
        calcular1 = new JButton ("Calcular");
        calcular1.setBounds(50, 300, 150, 40);
        calcular1.setFont(new Font("Verdana", Font.BOLD, 20));
        calcular1.setForeground(Color.BLACK);
        calcular1.addActionListener(this);
        panel_cuadrados_medios.add(calcular1);
        
        panel_cuadrados_medios_resultados = new JPanel ();
        panel_cuadrados_medios_resultados.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel_cuadrados_medios_resultados.setBounds(300, 125, 250, 400);
        panel_cuadrados_medios_resultados.setBackground(Color.WHITE);
        panel_cuadrados_medios.add(panel_cuadrados_medios_resultados);
        

        /*
        private JLabel ingresar_semilla1;
        private JLabel ingresar_iteraciones1;
        private JTextField recibir_semilla1;
        private JTextField recibir_iteraciones1;
        
        cantidadcomprar = new JTextField();
        cantidadcomprar.setBounds(80, 150, 80, 20);
        granpanel.add(cantidadcomprar);
         */
        //----------------------------------------------------------------------
        panel_productos_medios = new JPanel();
        panel_productos_medios.setLayout(null);
        panel_productos_medios.setBounds(50, 25, 600, 600);
        panel_productos_medios.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_productos_medios);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo de Productos Medios");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.CYAN);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_productos_medios.add(titulo);

        regresar2 = new JButton("Regresasr al menu");
        regresar2.setBounds(25, 520, 250, 50);
        regresar2.setBackground(Color.CYAN);
        regresar2.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar2.setForeground(Color.BLACK);
        regresar2.addActionListener(this);
        panel_productos_medios.add(regresar2);
        //----------------------------------------------------------------------

        //----------------------------------------------------------------------
        panel_multi_constante = new JPanel();
        panel_multi_constante.setLayout(null);
        panel_multi_constante.setBounds(50, 25, 600, 600);
        panel_multi_constante.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_multi_constante);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo de Multiplicador Constante");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.PINK);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_multi_constante.add(titulo);

        regresar3 = new JButton("Regresasr al menu");
        regresar3.setBounds(25, 520, 250, 50);
        regresar3.setBackground(Color.PINK);
        regresar3.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar3.setForeground(Color.BLACK);
        regresar3.addActionListener(this);
        panel_multi_constante.add(regresar3);
        //----------------------------------------------------------------------

        //----------------------------------------------------------------------
        panel_algoritmo_lineal = new JPanel();
        panel_algoritmo_lineal.setLayout(null);
        panel_algoritmo_lineal.setBounds(50, 25, 600, 600);
        panel_algoritmo_lineal.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_algoritmo_lineal);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo Lineal");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.ORANGE);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_algoritmo_lineal.add(titulo);

        regresar4 = new JButton("Regresasr al menu");
        regresar4.setBounds(25, 520, 250, 50);
        regresar4.setBackground(Color.ORANGE);
        regresar4.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar4.setForeground(Color.BLACK);
        regresar4.addActionListener(this);
        panel_algoritmo_lineal.add(regresar4);
        //----------------------------------------------------------------------
        panel_congru_multi = new JPanel();
        panel_congru_multi.setLayout(null);
        panel_congru_multi.setBounds(50, 25, 600, 600);
        panel_congru_multi.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_congru_multi);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo Congruencial Multiplicativo");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.YELLOW);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_congru_multi.add(titulo);

        regresar5 = new JButton("Regresasr al menu");
        regresar5.setBounds(25, 520, 250, 50);
        regresar5.setBackground(Color.YELLOW);
        regresar5.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar5.setForeground(Color.BLACK);
        regresar5.addActionListener(this);
        panel_congru_multi.add(regresar5);
        //----------------------------------------------------------------------

        //----------------------------------------------------------------------
        panel_congru_adi = new JPanel();
        panel_congru_adi.setLayout(null);
        panel_congru_adi.setBounds(50, 25, 600, 600);
        panel_congru_adi.setBackground(Color.DARK_GRAY);
        getContentPane().add(panel_congru_adi);

        titulo = new JLabel();
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("Algoritmo Congruencial Aditivo");
        titulo.setBounds(25, 30, 550, 50);
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_congru_adi.add(titulo);

        regresar6 = new JButton("Regresasr al menu");
        regresar6.setBounds(25, 520, 250, 50);
        regresar6.setBackground(Color.RED);
        regresar6.setFont(new Font("Verdana", Font.BOLD, 20));
        regresar6.setForeground(Color.BLACK);
        regresar6.addActionListener(this);
        panel_congru_adi.add(regresar6);
        //----------------------------------------------------------------------
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == boton_cuadrados_medios) {
            panel_principal.setVisible(false);
            panel_congru_adi.setVisible(false);
            panel_congru_multi.setVisible(false);
            panel_algoritmo_lineal.setVisible(false);
            panel_multi_constante.setVisible(false);
            panel_productos_medios.setVisible(false);
            panel_cuadrados_medios.setVisible(true);
            recibir_semilla1.setVisible(true);
            recibir_iteraciones1.setVisible(true);

        }
        if (ae.getSource() == boton_productos_medios) {
            panel_principal.setVisible(false);
            panel_cuadrados_medios.setVisible(false);
            panel_congru_adi.setVisible(false);
            panel_congru_multi.setVisible(false);
            panel_algoritmo_lineal.setVisible(false);
            panel_multi_constante.setVisible(false);
            panel_productos_medios.setVisible(true);
        }
        if (ae.getSource() == boton_multi_constante) {
            panel_principal.setVisible(false);
            panel_cuadrados_medios.setVisible(false);
            panel_productos_medios.setVisible(false);
            panel_congru_adi.setVisible(false);
            panel_congru_multi.setVisible(false);
            panel_algoritmo_lineal.setVisible(false);
            panel_multi_constante.setVisible(true);
        }
        if (ae.getSource() == boton_algortimo_lineal) {
            panel_principal.setVisible(false);
            panel_cuadrados_medios.setVisible(false);
            panel_productos_medios.setVisible(false);
            panel_multi_constante.setVisible(false);
            panel_congru_adi.setVisible(false);
            panel_congru_multi.setVisible(false);
            panel_algoritmo_lineal.setVisible(true);
        }
        if (ae.getSource() == boton_congru_multi) {
            panel_principal.setVisible(false);
            panel_cuadrados_medios.setVisible(false);
            panel_productos_medios.setVisible(false);
            panel_multi_constante.setVisible(false);
            panel_algoritmo_lineal.setVisible(false);
            panel_congru_adi.setVisible(false);
            panel_congru_multi.setVisible(true);
        }
        if (ae.getSource() == boton_congru_adi) {
            panel_principal.setVisible(false);
            panel_cuadrados_medios.setVisible(false);
            panel_productos_medios.setVisible(false);
            panel_multi_constante.setVisible(false);
            panel_algoritmo_lineal.setVisible(false);
            panel_congru_multi.setVisible(false);
            panel_congru_adi.setVisible(true);
        }
        if (ae.getSource() == regresar1) {
            panel_cuadrados_medios.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == regresar2) {
            panel_productos_medios.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == regresar3) {
            panel_multi_constante.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == regresar4) {
            panel_algoritmo_lineal.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == regresar5) {
            panel_congru_multi.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == regresar6) {
            panel_congru_adi.setVisible(false);
            panel_principal.setVisible(true);
        }
        if (ae.getSource() == calcular1) {
            //recibir_iteraciones1
            cmIteraciones(Double.parseDouble(recibir_semilla1.getText()), Integer.parseInt(recibir_iteraciones1.getText()));
            medios_mostrar = new JLabel[Integer.parseInt(recibir_iteraciones1.getText())];
            for (int i = 0; i < Integer.parseInt(recibir_iteraciones1.getText()); i++) {
                medios_mostrar[i].setText("X" + (i+1) + "---->" + String.valueOf(cuadrados_medios_ri[i]));
                medios_mostrar[i].setSize(100, 30);
                panel_cuadrados_medios_resultados.add(medios_mostrar[i]);
            }
            //panel_cuadrados_medios_resultados.add();
        }

    }
    /*
    static double cuadrados_medios_ri[];
    static int cuadrados_medios_x[];
    */
    public static void cmIteraciones(double semilla, int cantidad) {
        cuadrados_medios_ri = new double[cantidad];
        cuadrados_medios_x = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            cuadrados_medios_ri[i] = (int) semilla;
            semilla = Math.pow(semilla, 2);
            int entero = (int) semilla;
            char ar[] = String.valueOf(entero).toCharArray();
            semilla = nuevaSemilla(ar);
            cuadrados_medios_ri[i] = nuevaSemilla(ar) * 0.0001;
            cuadrados_medios_x[i] = (int) nuevaSemilla(ar);
        }

    }
    public static double nuevaSemilla(char ar[]) {
        double nueva_semilla = 0;

        nueva_semilla = Double.parseDouble(Character.toString(ar[(ar.length / 2) - 2])) * 1000;
        nueva_semilla = nueva_semilla + (Double.parseDouble(Character.toString(ar[(ar.length / 2) - 1])) * 100);
        nueva_semilla = nueva_semilla + (Double.parseDouble(Character.toString(ar[(ar.length / 2)])) * 10);
        nueva_semilla = nueva_semilla + Double.parseDouble(Character.toString(ar[(ar.length / 2) + 1]));

        return nueva_semilla;
    }


}
