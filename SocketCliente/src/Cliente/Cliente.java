/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Cliente {

    public static void main(String[] args) {

        MarcoCliente mimarco = new MarcoCliente();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoCliente extends JFrame {

    public MarcoCliente() {

        setBounds(600, 300, 280, 350);
        LaminaMarcoCliente milamina = new LaminaMarcoCliente();
        add(milamina);
        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel implements Runnable{

    public LaminaMarcoCliente() {
        nick = new JTextField (5);
        add(nick);
        
        
        
        JLabel texto = new JLabel("-*CHAT*-");

        add(texto);
        
        ip = new JTextField (8);
        add(ip);
        
        campochat = new JTextArea (12, 20);
        
        add(campochat);

        campo1 = new JTextField(20);

        add(campo1);

        miboton = new JButton("Enviar");

        EnviaTexto mievento = new EnviaTexto();
        miboton.addActionListener(mievento);
        
        add(miboton);
        
        Thread mihilo = new Thread (this);
        
        mihilo.start();

    }

    @Override
    public void run() {
    
    
         try{
             
             ServerSocket servidor_cliente = new ServerSocket (9090);
             
             Socket cliente;
             
             PaqueteEnvio paqueterecibido;
             //aqui se crea el ciclo que se va a estar repitiendo que practicamente son los mensajes
             while (true){
                 //acepta al otro, emmm, usuario
                 cliente = servidor_cliente.accept();
                 //muestra
                 ObjectInputStream flujoentrada = new ObjectInputStream (cliente.getInputStream());
                 //castea lo recibido, o sea, como un parseo 
                 paqueterecibido = (PaqueteEnvio) flujoentrada.readObject();
                 //y lo muestra 
                 campochat.append("\n" + paqueterecibido.getNick() + ": " + paqueterecibido.getMensaje());
             }
             
             
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
        
        
    }

    private class EnviaTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            try {
                //System.out.println(campo1.getText());
                Socket misocket = new Socket ("192.168.1.71", 9999);
                
                PaqueteEnvio datos = new PaqueteEnvio ();
                datos.setNick(nick.getText());
                datos.setIp(ip.getText());
                datos.setMensaje(campo1.getText());
                
                ObjectOutputStream paquete_datos = new ObjectOutputStream (misocket.getOutputStream());
                paquete_datos.writeObject(datos);
                misocket.close();
                
               /* DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
                flujo_salida.writeUTF(campo1.getText());
                flujo_salida.close();*/
            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private JTextField campo1, nick, ip;
    
    private JTextArea campochat;
    
    private JButton miboton;

}

class PaqueteEnvio implements Serializable{
    
    private String nick, ip, mensaje;

    public String getNick() {
        return nick;
    }

    public String getIp() {
        return ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}

// "192.168.56.1", 9999


