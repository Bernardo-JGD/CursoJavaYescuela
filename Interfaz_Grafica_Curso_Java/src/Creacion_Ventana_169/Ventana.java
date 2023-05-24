package Creacion_Ventana_169;
//importo la clase JFrame 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    //Creo el constructo de mi clase 
    public Ventana() {

        //este metodo sirve para hacer algo despues de que cierro la ventana
        //el parametro que recibe "EXIT_ON_CLOSE" sirve para que cuando 
        // yo cierre mi ventana se termine la ejecucion de mi programa 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Este metodo recibe un parametro de tipo String que sera el titilo de la ventana 
        setTitle("Ventana");

        //-------------------------------------------------------------------------------
        //-----------------------para la posicion de la ventana y el tamaño al abrir la ventana 
        //-------------------------------------------------------------------------------        
        //este metodo recibe dos parametros de tipo int separados por coma 
        //el primer valor es para las x de izquierda a derecha 
        //el segundo valor es para las y de arriba a abajo 
        /*
          setLocation (100, 100);
           //con esto declaro el tamaño de mi ventana 
            setSize (500, 500); 
        
           setBounds(100, 100, 500, 500);
         */
        setSize(500, 500);
        //este metodo sirve para colocar la ventana en el centro del programa al momento
        //que se ejecuta el programa 
        setLocationRelativeTo(null);

        //sirve para evitar que el usuario manipule el tamaño de la ventana (evita que la estire)
        //recive un parametro de tipo boolean
        //true = si la puede redimensionar
        //false = no puede manipular el tamaño
        //setResizable(false);
        /*
          // este metodo establece el tamaño minimo al que se puede reducir la ventana 
        // tiene que importar import java.awt.Dimension;
        setMinimumSize(new Dimension(100, 100)); 
         */
        //
        //-------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------
        /*
       // establece el color de fondo de la ventana  
        // tengo que importar import java.awt.Color;
       getContentPane().setBackground(Color.BLACK);
         */
        
        // de esta manera llamo el metodo dentro de esta misma clase 
        iniciarComponentes();
        
    }
         // para poner un panel 
        // al declarar el objeto de tipo panel tengo que importar 
    private void iniciarComponentes() {
        JPanel panel = new JPanel ();
        
        //el metodo setLayout sirve para que al momento de colocar cosas sobre el panel (o sobre la 
        //ventana) pueda entender las coordenadas y colocar las cosas donde le indico
        // esto es cuando el parametro que recibe es "null"
        panel.setLayout(null);
        
        
        
        // de esta manera agrego el panel sobre la ventana 
        getContentPane().add(panel);
        // agrego color al panel 
        panel.setBackground(Color.LIGHT_GRAY);
        
        
        //esto es para agregar texto sobre la ventana 
        // creo un objeto de tipo JLabel
        // y tengo que importar import javax.swing.JLabel;
        //recibe un parametro de tipo string o una imagen 
        JLabel etiqueta1 = new JLabel ("hola") ;
        etiqueta1.setBounds(30, 30, 30, 20);
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.BLACK);
        panel.add(etiqueta1);
        
        /*
        creo otra etiqueta para ver la otra forma de agregar texto 
        */
        // creo el objeto 
        JLabel etiqueta2 = new JLabel ();
        //pongo e objeto y llamo el metodo setText();
        //que recibe un valor de tipo String 
        etiqueta2.setText("Etiqueta 2");
        //el método setBounds sirve para colocar las coordenadas de la etiqueta y su tamaño
        // (x, y, largo, ancho)
        etiqueta2.setBounds(100, 100, 60, 30);
        //este metodo setForeground sirve para cambiar el color del texto de la etiqueta
        etiqueta2.setForeground(Color.BLUE);
        //este metodo (setBackground) sirve para cambiar el color de fondo de la etiqueta
        //pero para funcionar tiene que usarte el metodo setOpaque(); // recibe un parametro booleano 
        //porque por defecto no permite cambiar el color de fondo 
        //si el parametro que recibe setOpaque();
        //es :
        // true = le estoy dando permiso de que me cambie el color de fondo de la etiqueta 
        //false = me niega el permiso de edicion de color de fondo de la etiqueta 
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.yellow);
        panel.add(etiqueta2);
        
        
        
        
        /*--------------------------------------------------------------------------------------
        
        voy a trabajar con otra etiqueta para poder hacer la practica de la modificacion de la ubicacion 
        de el texto dentro de la misma area de la etiqueta 
        esto es como cuando el word quiere poner el texto centrado o a la izquierda del renglon o en medio
        
        -----------------------------------------------------------------------------------------*/
        //de esta manera cambio la ubicacion del texto dentro de su area
        // la estructura para recibir parametros es la siguiente
        //("texto", SwingConstants.poscion)
        //en este caso lo alineo al centro
        JLabel etiqueta3 = new JLabel ("Etiqueta 3", SwingConstants.CENTER);
        
        etiqueta3.setBounds(150, 150, 250, 20);
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.BLACK);
        etiqueta3.setForeground(Color.YELLOW);
        panel.add(etiqueta3);
        
        
        JLabel etiqueta4 = new JLabel ();
        etiqueta4.setBounds(200, 40, 200, 20);
        etiqueta4.setText("Etiqueta 4");
        etiqueta4.setForeground(Color.GREEN);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.BLACK);
        //esta es otra forma de alinear texto dentro de una etiqueta
        //este es para alinear de manera horizontal solamente 
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta4);
        
        // aqui modificaré la fuente del texto, el tipo de letra, el tamaño
        JLabel etiqueta5 = new JLabel ();
        etiqueta5.setText("Arial, romanbaseline, 12");
        etiqueta5.setBounds(20, 190, 200, 20);
        etiqueta5.setForeground(Color.WHITE);
        etiqueta5.setOpaque(true);
        etiqueta5.setBackground(Color.BLACK);
        //alineada a la derecha 
        etiqueta5.setHorizontalAlignment(SwingConstants.RIGHT);
        //aqui es donde voy a modificar la fuente del texto
        //uso el metodo setFont();
        //es un metodo de tipo void
        //recibe un objeto de tipo font
        //en este caso recibe tres parametros, se sobrecarga el metodo
        //("tipo de letra", Font.formato, negrita, cursiva..., tamaño int)
        
        // el parametro de el estilo de fuente(ejemplo: negrita) puede ser puesto por numero int
        etiqueta5.setFont(new Font ("arial", Font.ROMAN_BASELINE, 12));
        panel.add(etiqueta5);
        
        
        
    }
}
