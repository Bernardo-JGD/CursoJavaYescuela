package crud;

import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Crud extends JFrame implements ActionListener {

    public JLabel lb, fondo;
    public JTextField tf;
    public JPasswordField pf;
    public JButton bt;

    public Crud() {
        setLayout(null);

        this.getContentPane().setBackground(Color.BLACK);
        fondo = new JLabel();
        fondo.setBounds(0, 0, 200, 200);
        fondo.setIcon(new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Crud\\build\\classes\\crud\\iconow.png"));
        add(fondo);

        lb = new JLabel("Ingrese Usuario");
        lb.setForeground(Color.YELLOW);
        lb.setBounds(200, 40, 100, 20);
        add(lb);

        tf = new JTextField();
        tf.setBounds(200, 60, 100, 20);
        add(tf);

        lb = new JLabel("Ingrese Contraseña");
        lb.setForeground(Color.YELLOW);
        lb.setBounds(200, 80, 200, 20);
        add(lb);

        pf = new JPasswordField();
        pf.setBounds(200, 100, 100, 20);
        add(pf);
        //BBdD124artnoc@zep1
        bt = new JButton("Ingresar");
        bt.setOpaque(false);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.RED);
        bt.setBounds(200, 130, 100, 20);
        bt.addActionListener(this);
        add(bt);

    }

    public static void main(String[] args) {
        Crud ob = new Crud();

        ob.setVisible(true);
        ob.setBounds(0, 0, 400, 300);
        ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MySql sb = new MySql();
        if (e.getSource() == bt) {
            sb.Conectar(tf.getText(), pf.getText());
        }
    }

}
