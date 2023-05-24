package Chat;

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
        
        this.addWindowListener(new EnvioOnline());
    }

}
//++++++++++++++++++++++++++++++++++++++++++envio que esta en linea 
class EnvioOnline extends WindowAdapter{
    
    public void windowOpened(WindowEvent e ){
        
        try{
            Socket misocket = new Socket ("192.168.1.71", 9999);
            
            PaqueteEnvio datos = new PaqueteEnvio ();
            
            datos.setMensaje("Online");
            
            ObjectOutputStream paquete_datos = new ObjectOutputStream (misocket.getOutputStream());
            
            paquete_datos.writeObject(datos);
            
            misocket.close();
            
        }catch (Exception e2){
            
        }
        
    }
    
}
//++++++++++++++++++++++++++++++++++++++++++envio que esta en linea 
class LaminaMarcoCliente extends JPanel implements Runnable{

    public LaminaMarcoCliente() {
        
        String nick_usuario = JOptionPane.showInputDialog("Nick: ");
        
        JLabel n_nick = new JLabel ("Nick: ");
        add(n_nick);
        
        nick = new JLabel ();
        nick.setText(nick_usuario);
        add(nick);
        
        
        
        JLabel texto = new JLabel("Online");

        add(texto);
        
        ip = new JComboBox();
        /*ip.addItem("Usuario1: ");
        ip.addItem("Usuario2: ");
        ip.addItem("Usuario3: ");*/
        
        ip.addItem("192.168.1.71");
        ip.addItem("192.168.1.71");
        
        add(ip);
        
        campochat = new JTextArea (12, 20);
        
        add(campochat);

        campo1 = new JTextField(20);

        add(campo1);

        miboton = new JButton("Enviar");

        EnviaTexto mievento = new EnviaTexto();
        
        
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
                datos.setIp(ip.getSelectedItem().toString());
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

    private JTextField campo1;
    
    private JComboBox ip;
    
    private JLabel nick;
    
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


