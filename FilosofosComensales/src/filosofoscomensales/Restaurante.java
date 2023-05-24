package filosofoscomensales;

import com.sun.prism.paint.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.Image;

public class Restaurante extends JFrame implements Runnable {

    private JLabel filo1, filo2, filo3, filo4, filo5, fondolabel, fondolabel2, mesalabel;
    private ImageIcon im1, im2, gif1, gif2, im3, gif3, im4, fondo, im5, mesa, im6, im7, im8, im9, im10, im11, mesa1, mesa2, mesa3, mesa4, mesa5, mesa5s, im12, mesaconpollo;
    Thread t;
    private JPanel granpanel, pequepanel;
    int varfilo1 = 0, varfilo2 = 0, varfilo3 = 0, varfilo4 = 0, varfilo5 = 0;
    public JLabel filosofo1, filosofo2, filosofo3, filosofo4, filosofo5;
    private ImageIcon im13, fondo2;

    public Restaurante() {

        super ("Filosofos Comelones");
        t = new Thread(this);
        t.start();
        setLayout(null);

        granpanel = new JPanel();
        granpanel.setBounds(0, 0, 700, 700);
        granpanel.setLayout(null);
        granpanel.setOpaque(false);
        getContentPane().add(granpanel);

        pequepanel = new JPanel();
        pequepanel.setBounds(700, 0, 500, 700);
        pequepanel.setLayout(null);
        pequepanel.setOpaque(false);
        getContentPane().add(pequepanel);

        filosofo1 = new JLabel("Filosofo 1:--- " + varfilo1);
        filosofo1.setOpaque(false);
        filosofo1.setBounds(100, 200, 290, 50);
        filosofo1.setForeground(java.awt.Color.RED);
        filosofo1.setFont(new Font("Times New Roman", Font.BOLD, 45));
        pequepanel.add(filosofo1);

        filosofo2 = new JLabel("Filosofo 2:--- " + varfilo2);
        filosofo2.setOpaque(false);
        filosofo2.setBounds(100, 250, 290, 50);
        filosofo2.setForeground(java.awt.Color.GREEN);
        filosofo2.setFont(new Font("Times New Roman", Font.BOLD, 45));
        pequepanel.add(filosofo2);

        filosofo3 = new JLabel("Filosofo 3:--- " + varfilo3);
        filosofo3.setOpaque(false);
        filosofo3.setBounds(100, 300, 290, 50);
        filosofo3.setForeground(java.awt.Color.MAGENTA);
        filosofo3.setFont(new Font("Times New Roman", Font.BOLD, 45));
        pequepanel.add(filosofo3);

        filosofo4 = new JLabel("Filosofo 4:--- " + varfilo4);
        filosofo4.setOpaque(false);
        filosofo4.setBounds(100, 350, 290, 50);
        filosofo4.setForeground(java.awt.Color.BLUE);
        filosofo4.setFont(new Font("Times New Roman", Font.BOLD, 45));
        pequepanel.add(filosofo4);

        filosofo5 = new JLabel("Filosofo 5:--- " + varfilo5);
        filosofo5.setOpaque(false);
        filosofo5.setBounds(100, 400, 290, 50);
        filosofo5.setForeground(java.awt.Color.ORANGE);
        filosofo5.setFont(new Font("Times New Roman", Font.BOLD, 45));
        pequepanel.add(filosofo5);

        im1 = new ImageIcon(getClass().getResource("/Img/Pensando.gif"));
        gif1 = new ImageIcon(im1.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(getClass().getResource("/Img/Comiendo.gif"));
        gif2 = new ImageIcon(im2.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT));
        im3 = new ImageIcon(getClass().getResource("/Img/Moricion.gif"));
        gif3 = new ImageIcon(im3.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT));
        im4 = new ImageIcon(getClass().getResource("/Img/Fondo.jpg"));
        fondo = new ImageIcon(im4.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        im5 = new ImageIcon(getClass().getResource("/Img/MesaCircular.png"));
        mesa = new ImageIcon(im5.getImage().getScaledInstance(340, 300, Image.SCALE_DEFAULT));

        im6 = new ImageIcon(getClass().getResource("/Img/Mesa1.png"));
        mesa1 = new ImageIcon(im6.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));
        im7 = new ImageIcon(getClass().getResource("/Img/Mesa2.png"));
        mesa2 = new ImageIcon(im7.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));
        im8 = new ImageIcon(getClass().getResource("/Img/Mesa3.png"));
        mesa3 = new ImageIcon(im8.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));
        im9 = new ImageIcon(getClass().getResource("/Img/Mesa4.png"));
        mesa4 = new ImageIcon(im9.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));
        im10 = new ImageIcon(getClass().getResource("/Img/Mesa5.png"));
        mesa5 = new ImageIcon(im10.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));
        im11 = new ImageIcon(getClass().getResource("/Img/Mesa5Solo.png"));
        mesa5s = new ImageIcon(im11.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));

        im12 = new ImageIcon(getClass().getResource("/Img/MesaConPollo.png"));
        mesaconpollo = new ImageIcon(im12.getImage().getScaledInstance(430, 430, Image.SCALE_DEFAULT));

        im13 = new ImageIcon(getClass().getResource("/Img/Menu2.jpg"));
        fondo2 = new ImageIcon(im13.getImage().getScaledInstance(500, 700, Image.SCALE_DEFAULT));

        fondolabel = new JLabel();
        fondolabel.setBounds(0, 0, 700, 700);
        fondolabel.setIcon(fondo);
        add(fondolabel);

        //fondolabel2
        fondolabel2 = new JLabel();
        fondolabel2.setBounds(700, 0, 500, 700);
        fondolabel2.setIcon(fondo2);
        add(fondolabel2);

        filo1 = new JLabel();
        filo1.setBounds(0, 100, 150, 200);
        filo1.setIcon(gif1);
        granpanel.add(filo1);

        filo2 = new JLabel();
        filo2.setBounds(270, 40, 150, 200);
        filo2.setIcon(gif1);
        granpanel.add(filo2);

        filo3 = new JLabel();
        filo3.setBounds(540, 100, 150, 200);
        filo3.setIcon(gif1);
        granpanel.add(filo3);

        filo4 = new JLabel();
        filo4.setBounds(460, 450, 150, 200);
        filo4.setIcon(gif1);
        granpanel.add(filo4);

        filo5 = new JLabel();
        filo5.setBounds(120, 450, 150, 200);
        filo5.setIcon(gif1);
        granpanel.add(filo5);

        mesalabel = new JLabel();
        mesalabel.setBounds(180, 180, 380, 400);
        mesalabel.setIcon(mesa);
        granpanel.add(mesalabel);

        setSize(1200, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void run() {

    }

    public void TodosPensando() {
        filo1.setIcon(gif1);
        filo2.setIcon(gif1);
        filo3.setIcon(gif1);
        filo4.setIcon(gif1);
        filo5.setIcon(gif1);
        mesalabel.setBounds(150, 180, 430, 430);
        mesalabel.setIcon(mesaconpollo);
    }

    public void Cambio1() {
        //comen
        filo1.setIcon(gif2);
        filo3.setIcon(gif2);
        //piensan
        filo2.setIcon(gif1);
        filo4.setIcon(gif1);
        filo5.setIcon(gif1);

        mesalabel.setIcon(mesa1);
    }

    public void Cambio2() {
        //comen 
        filo2.setIcon(gif2);
        filo4.setIcon(gif2);
        //piensan 
        filo1.setIcon(gif1);
        filo3.setIcon(gif1);
        filo5.setIcon(gif1);

        mesalabel.setIcon(mesa2);
    }

    public void Cambio3() {
        //comen
        filo3.setIcon(gif2);
        filo5.setIcon(gif2);
        //piensan
        filo1.setIcon(gif1);
        filo2.setIcon(gif1);
        filo4.setIcon(gif1);

        mesalabel.setIcon(mesa3);

    }

    public void Cambio4() {
        //comen
        filo1.setIcon(gif2);
        filo4.setIcon(gif2);
        //piensan
        filo2.setIcon(gif1);
        filo3.setIcon(gif1);
        filo5.setIcon(gif1);

        mesalabel.setIcon(mesa4);
    }

    public void Cambio5() {
        //comen
        filo2.setIcon(gif2);
        filo5.setIcon(gif2);
        //piensan
        filo1.setIcon(gif1);
        filo3.setIcon(gif1);
        filo4.setIcon(gif1);

        mesalabel.setIcon(mesa5);
    }

    public void Cambio5Solito() {
        //come
        filo5.setIcon(gif2);
        //piensan 
        filo1.setIcon(gif1);
        filo2.setIcon(gif1);
        filo3.setIcon(gif1);
        filo4.setIcon(gif1);

        mesalabel.setIcon(mesa5s);
    }

    public void MoricionDelosHilos() {
        filo1.setIcon(gif3);
        filo2.setIcon(gif3);
        filo3.setIcon(gif3);
        filo4.setIcon(gif3);
        filo5.setIcon(gif3);
        mesalabel.setBounds(180, 180, 380, 400);
        mesalabel.setIcon(mesa);
    }

    public int  Incremento1() {
        return 1;
    }
 

    /*
    for (int i = 0; i < 6; i++) {

            if (i == 0) {
                try {
                    res.pensando1();
                    Thread.sleep(1000);
                    res.comiendo1();
                    Thread.sleep(1000);
                    res.pensando1();
                } catch (InterruptedException e) {

                    System.out.println("Error en la clase Restaurante: " + e);

                }
            } 
            if(i==1){
                try {
                    res.pensando2();
                    Thread.sleep(3000);
                    res.comiendo2();
                    Thread.sleep(3000);
                    res.pensando2();
                } catch (InterruptedException e) {

                    System.out.println("Error en la clase Restaurante: " + e);

                }
            }

        }
     */
 /*
     for (int i = 0; i < 5; i++) {
            
            try {
                res.comiendo1();
                Thread.sleep(3000);
                res.pensando1();
            } catch (InterruptedException e) {

                System.out.println("Error en la clase Restaurante: " + e);

            }
        }
     */
 /*
    for (int i = 0; i < 6; i++) {

            if (i == 0) {
                res.pensando1();
                res.comiendo1();
                try {
                    
                    Thread.sleep(1000);
                    
                    Thread.sleep(1000);
                    
                } catch (InterruptedException e) {

                    System.out.println("Error en la clase Restaurante: " + e);

                }
                res.pensando1();
                
            } 
            if(i==1){
                res.pensando2();
                res.comiendo2();
                try {
                    
                    Thread.sleep(3000);
                    
                    Thread.sleep(3000);
                    
                } catch (InterruptedException e) {

                    System.out.println("Error en la clase Restaurante: " + e);

                }
                res.pensando2();
            }

        }
     */
}
