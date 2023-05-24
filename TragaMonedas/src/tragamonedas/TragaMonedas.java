package tragamonedas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class TragaMonedas extends JFrame implements ActionListener {

    int contador = 0;
    private JLabel imagen;
    private ImageIcon foto1, foto2, foto3, icono;
    private JButton boton, boton1;
    private JPanel granpanel;
    private Timer timer;

    /**
     * @param args the command line arguments
     */
    public TragaMonedas() {
        granpanel = new JPanel();
        granpanel.setLayout(null);
        Color plantilla = new Color(40, 120, 250);
        granpanel.setBackground(plantilla);

        imagen = new JLabel();
        imagen.setBounds(400, 0, 400, 400);
        foto1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM1.jpg");
        foto2 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM2.jpg");
        foto3 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM3.jpg");
        icono = new ImageIcon(foto1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        imagen.setIcon(icono);
        granpanel.add(imagen);

        boton1 = new JButton("Stop");
        boton1.setBounds(200, 100, 100, 50);
        boton1.setForeground(Color.YELLOW);
        boton1.setOpaque(true);
        boton1.setBackground(Color.BLACK);
        boton1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        boton1.addActionListener(this);
        granpanel.add(boton1);

        boton = new JButton("Inicio");
        boton.setBounds(50, 100, 100, 50);
        boton.setForeground(Color.YELLOW);
        boton.setOpaque(true);
        boton.setBackground(Color.BLACK);
        boton.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        boton.addActionListener(this);
        granpanel.add(boton);

        this.getContentPane().add(granpanel);
    }

    public static void main(String[] args) {

        TragaMonedas tm = new TragaMonedas();
        tm.setBounds(0, 20, 1000, 500);
        tm.setTitle(" Giro");
        tm.setVisible(true);
        tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            timer = new Timer();

            TimerTask evento = new TimerTask() {

                @Override
                public void run() {
                    switch (contador) {
                        case 0:
                            contador = 1;
                            icono = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM2.jpg");
                            icono = new ImageIcon(foto2.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
                            imagen.setIcon(icono);
                            break;
                        case 1:
                            contador = 2;
                            icono = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM1.jpg");
                            icono = new ImageIcon(foto1.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
                            imagen.setIcon(icono);
                            break;
                        case 2:
                            contador = 0;
                            icono = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\TragaMonedas\\src\\IM3.jpg");
                            icono = new ImageIcon(foto3.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
                            imagen.setIcon(icono);
                            break;
                    }
                }
            };
            timer.scheduleAtFixedRate(evento, 50, 50);
        }
        if (e.getSource() == boton1) {
            timer.cancel();
        }
    }

}
