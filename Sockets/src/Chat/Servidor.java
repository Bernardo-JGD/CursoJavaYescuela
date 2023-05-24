package Chat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    public static void main(String[] args) {

        MarcoServidor mimarco = new MarcoServidor();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoServidor extends JFrame implements Runnable {

    public MarcoServidor() {

        setBounds(1200, 300, 280, 350);

        JPanel milamina = new JPanel();
        milamina.setLayout(new BorderLayout());

        areatexto = new JTextArea();

        milamina.add(areatexto, BorderLayout.CENTER);
        add(milamina);
        setVisible(true);
        Thread mihilo = new Thread(this);
        mihilo.start();
    }

    @Override
    public void run() {

        // System.out.println("Oigo");
        try {

            ServerSocket servidor = new ServerSocket(9999);
            String nick, ip, mensaje;
            
            PaqueteEnvio paquete_recibido;
            
             //aqui se crea el ciclo que se va a estar repitiendo que practicamente son los mensajes
            while (true) {
                
                //acepta 
                Socket misocket = servidor.accept();
                //mostrar
                ObjectInputStream paquete_datos = new ObjectInputStream (misocket.getInputStream());
                //recibe
                paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
                //asigna de acuerdo a lo recibido del objeto a cada atributo
                nick = paquete_recibido.getNick();
                ip = paquete_recibido.getIp();
                mensaje = paquete_recibido.getMensaje();
                
               /* DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());

                String mensajetexto = flujo_entrada.readUTF();

                areatexto.append("\n" + mensajetexto);
                */
               
               //aqui es lo que se muestra en el chat 
                areatexto.append ("\n" + nick + ": " + mensaje + ": " + "para " + ip);
                
                Socket Envia_Destinatario = new Socket (ip, 9090);
                
                ObjectOutputStream PaqueteReenvio = new ObjectOutputStream (Envia_Destinatario.getOutputStream());
                
                PaqueteReenvio.writeObject(paquete_recibido);
                
                PaqueteReenvio.close();
                
                Envia_Destinatario.close();
                
                misocket.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private JTextArea areatexto;
}
