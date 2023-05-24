package filosofos;

import java.awt.Image;
import java.util.Random;
import javax.swing.*;

public class Filosofo extends JFrame implements Runnable {

    //Aqui empiezo a agregar cosas para el frame 
    //declaro los labels, imagen/gif
    private JLabel filo1, filo2, filo3, filo4, filo5;
    //1pensando,  2comiendo 
    private ImageIcon im1, g1, im2, g2;
    // varaibles para poder decirles a todos que dejen de comer y se pongan a pensar 
    private int contadorde135=0;
    private int contadorde24=4;
    

    // esta clase es la que ocntiene todos los metodos para el proceso del programa de los filosofos
    int id;// es el id que resivira el id de los filoosofos de la mesa
    Thread t;// se crea una variable de thread
    Tenedor derecho; // derecho y izquierdo son los tenedores que ocntiene cada filosofo
    Tenedor izquierdo;// para indicar cuando come cada uno
    int espera;
    Random r; // resibe un valor random
    Tenedor mesa[]; // se crea un vector mesa de tipo tenedor 

    public Filosofo(int id, Tenedor derecho, Tenedor izquierdo, Tenedor mesa[]) { // constructor de clase filosofo que recibe los datos de los filosofos 
        this.id = id;// y se inicializan todos los datos correspondientes a cada filosofo y la accion que realizan
        this.derecho = derecho;
        this.izquierdo = izquierdo;
        System.out.println("El filosofo " + (id + 1) + " puede usar el tenedor " + (derecho.id + 1) + " y el tenedor " + (izquierdo.id + 1)); // se imprime la accion del filosofo
        this.mesa = mesa;
        r = new Random();// resive el valor de un numero random
        t = new Thread(this); // se crea un hilo sobre el filosofo que entro en el metodo en el momento 
        t.start();// se inicia la accion del filosofo y se indica si esta comienod o no en la inpreicon de arriba

        //inicializo los labels y las imagenes 
        setLayout(null);
        im1 = new ImageIcon(getClass().getResource("/Img/Pensando.gif"));
        g1 = new ImageIcon(im1.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
        im2 = new ImageIcon(getClass().getResource("/Img/Comiendo.gif"));
        g2 = new ImageIcon(im2.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));

        filo1 = new JLabel();
        filo1.setBounds(10, 30, 100, 150);
        filo1.setIcon(g1);
        add(filo1);

        filo2 = new JLabel();
        filo2.setBounds(120, 30, 100, 150);
        filo2.setIcon(g1);
        add(filo2);

        filo3 = new JLabel();
        filo3.setBounds(230, 30, 100, 150);
        filo3.setIcon(g1);
        add(filo3);

        filo4 = new JLabel();
        filo4.setBounds(10, 200, 100, 150);
        filo4.setIcon(g1);
        add(filo4);

        filo5 = new JLabel();
        filo5.setBounds(120, 200, 100, 150);
        filo5.setIcon(g1);
        add(filo5);
        if (contadorde24==7) {
                filo1.setIcon(g1);
                filo2.setIcon(g1);
                filo3.setIcon(g1);
                filo4.setIcon(g1);
                filo5.setIcon(g1);
            }

        setSize(650, 650);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void run() {// metodo que viene cuando  implementas la clase runnable
        for (int i = 0; i < 3; i++) { // este for indica el numero de veces que entrara a comer cada filosofo en este ejemplo entraran 3 veces a comer los cada filosofo
            synchronized (this.derecho) {// si el fisolofo tiene tenedor derecho
                synchronized (this.izquierdo) {// y el tenedor izquierdo entonces
                    comer();// se pondra a comer 
          
                }
            }// si no los tiene los dos  tenedores
            pensar();// se pondra a pensar 

        }

        System.out.println("Filosofo " + (id + 1) + " termino de comer y pensar"); // si cumple el filosofo  con las 3 veces que debe de comer entonces se imprime este mensaje
    }

    public void comer() {// este metodo se llama cuando el filosofo cumple con la condicion de tener dos tenedores en sus manos
        System.out.println("\tFilosofo " + (id + 1) + "  comera con el  tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));// indique que filosofo esta comiendo y que tenedores son los que esta utilizando 
        derecho.tomar(id); // derecho llama el metodo tomar que hace que cambie la bandera a verdadero e indica que el tenedor a sido tomado por el filosofo que le pertenece el id
        izquierdo.tomar(id);//izquierdo llama el metodo tomar que hace que cambie la bandera a verdadero e indica que el tenedor a sido tomado por el filosofo que le pertenece el id
        espera = r.nextInt(5000); // espera recibe el  numero random que se guardo en la variable " r "
        System.out.println("\t ------------- Filosofo " + (id + 1) + " comiendo --------------");// ya que se cumple que tiene los dos tenedores se imprime el mensaje que el filosofo esta comiendo

        try {
            Thread.sleep(espera);// se duerme durante unos segundos  que es el tiempo en el que esta comiendo el filosofo
            //System.out.println("id: " + id );
            
            if (id== 1) {
                filo1.setIcon(g2);
                filo3.setIcon(g2);
                filo5.setIcon(g2);
                filo2.setIcon(g1);
                filo4.setIcon(g1);
                contadorde135++;
            }
            
            
                
            

        } catch (InterruptedException e) {
        }
        derecho.soltar();// ya que el hilo despierta suelta el tenedor  que tenia en la derecha
        izquierdo.soltar();// y tambien el de la izquierda
        System.out.println("\tFilosofo " + (id + 1) + " termino de comer y libero tenedores " + (this.izquierdo.id + 1) + " y " + (this.derecho.id + 1));// y se imprime el mensaje este despues de termminar de comer el filosofo
    }

    public void pensar() {// este metodo indica al filosofo que debe esperar en y se ponga a comer
        espera = (r.nextInt(5000));// recibe un numero random 

        try {
            System.out.println("\t El filosofo " + (id + 1) + " esta pensando ");// cuando el filosofo libera los tenedores se manda este mensaje indicando que ese filosofo entra en estado de reposo
            Thread.sleep(espera);// thread que hace que el filosofo espere hasta que le llegue otra vez su turno de comer
           // System.out.println("id: " + id );
            //aqui cambia la imagen a pensar
            if (id== 1) {
                filo1.setIcon(g1);
                filo3.setIcon(g1);
                filo5.setIcon(g1);
                filo2.setIcon(g2);
                filo4.setIcon(g2);
                contadorde24++;
                System.out.println("contador: " + contadorde24);
            }
            

            // filo1.setIcon(g1);
        } catch (InterruptedException e) {
        }
    }

    public String checar_mesa() { // este metodo es el que se encarga de revisar quien tiene los tenedores 
        String a = "";
        for (int i = 0; i < mesa.length; i++) {// con este ciclo se recorre toda la mesa
            a = a + ("[" + mesa[i].ban + "]"); // indica cuando un filosofo cuenta con los dos tenedores y se puede poner a comer
        }
        return a;// regesa su valor;
    }
}
