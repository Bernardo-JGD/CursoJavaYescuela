package filosofoscomensales;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FilosofosComensales {

    private ImageIcon im1, im2, gif1, gif2;

    public FilosofosComensales() {
        im1 = new ImageIcon(getClass().getResource("/Img/Pensando.gif"));
        gif1 = new ImageIcon(im1.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(getClass().getResource("/Img/Comiendo.gif"));
        gif2 = new ImageIcon(im2.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));

    }

    public static void main(String[] args) {
        int varfilo1 = 0, varfilo2 = 0, varfilo3 = 0, varfilo4 = 0, varfilo5 = 0;
        Restaurante r = new Restaurante();
        r.setVisible(true);
        int val=1;
        Thread grupo1 = new Thread(new Restaurante());
        Thread grupo2 = new Thread(new Restaurante());
        /*  Thread hilofilosofo3 = new Thread(new Restaurante());
        Thread hilofilosofo4 = new Thread(new Restaurante());
        Thread hilofilosofo5 = new Thread(new Restaurante());
         */
        grupo1.start();
        grupo2.start();
        // hilofilosofo3.start();
        // hilofilosofo4.start();
        // hilofilosofo5.start();

        //C:\Users\TOSHIBA\Documents\NetBeansProjects\FilosofosComensales\build\classes\Musica Filosofos wav.wav
        try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\FilosofosComensales\\build\\classes\\Musica Filosofos wav.wav").getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        try {
            r.TodosPensando();
            grupo1.sleep(5000);
        } catch (InterruptedException e) {

        }
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                try {
                    r.Cambio1();
                    varfilo1++;
                    varfilo3++;
                    r.filosofo1.setText("Filosofo 1:--- " + varfilo1);
                    r.filosofo3.setText("Filosofo 3:--- " + varfilo3);
                    //r.Incremento1(val);
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    varfilo2++;
                    varfilo4++;
                    r.filosofo2.setText("Filosofo 2:--- " + varfilo2);
                    r.filosofo4.setText("Filosofo 4:--- " + varfilo4);
                    r.Cambio2();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    varfilo3++;
                    varfilo5++;
                    r.filosofo3.setText("Filosofo 3:--- " + varfilo3);
                    r.filosofo5.setText("Filosofo 5:--- " + varfilo5);
                    r.Cambio3();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    varfilo1++;
                    varfilo4++;
                    r.filosofo1.setText("Filosofo 1:--- " + varfilo1);
                    r.filosofo4.setText("Filosofo 4:--- " + varfilo4);
                    r.Cambio4();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    varfilo2++;
                    varfilo5++;
                    r.filosofo2.setText("Filosofo 2:--- " + varfilo2);
                    r.filosofo5.setText("Filosofo 5:--- " + varfilo5);
                    r.Cambio5();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
            } else {

                try {
                    varfilo1++;
                    varfilo3++;
                    r.filosofo1.setText("Filosofo 1:--- " + varfilo1);
                    r.filosofo3.setText("Filosofo 3:--- " + varfilo3);
                    r.Cambio1();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    varfilo2++;
                    varfilo4++;
                    r.filosofo2.setText("Filosofo 2:--- " + varfilo2);
                    r.filosofo4.setText("Filosofo 4:--- " + varfilo4);
                    r.Cambio2();
                    r.Cambio2();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }
                try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\FilosofosComensales\\build\\classes\\MEME ATAÚD _ Funeral Dance Meme _ Astronomia Guitar TABS _ Christianvib (128 kbps) (online-audio-converter.com).wav").getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(FilosofosComensales.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    varfilo5++;
                    r.filosofo5.setText("Filosofo 5:--- " + varfilo5);
                    r.Cambio5Solito();
                    grupo1.sleep(5000);

                } catch (InterruptedException e) {

                }

            }
        }
        //C:\Users\TOSHIBA\Documents\NetBeansProjects\FilosofosComensales\build\classes\filosofoscomensales\MEME ATAÚD _ Funeral Dance Meme _ Astronomia Guitar TABS _ Christianvib (128  kbps).mp3
        try {
            r.TodosPensando();
            grupo1.sleep(6000);

        } catch (InterruptedException e) {

        }
        try {
            r.MoricionDelosHilos();
            grupo1.sleep(2000);
        } catch (InterruptedException e) {

        }

        /*
         for (int i = 0; i < 3; i++) {
            try {
                r.GrupoUnoComiendo();
                grupo1.sleep(3000);

            } catch (InterruptedException e) {

            }
            try {
                r.GrupoDosComiendo();
                grupo1.sleep(3000);

            } catch (InterruptedException e) {

            }
        }
         */

 /*  try {
            r.pensando1();
            grupo1.sleep(3000);
        } catch (InterruptedException e) {

        }*/

 /* try{
        r.pensando2();
        grupo1.sleep (3000);
        }catch(InterruptedException e){
            
        }
         */
 /*try {
            r.pensando2();
            grupo1.sleep(3000);
        } catch (InterruptedException e) {

        }
         */
    }

}
