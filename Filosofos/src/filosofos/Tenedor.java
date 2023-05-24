
package filosofos;


public class Tenedor {
   // la clase para crear la mesa de los filosofos
    int id;
    boolean ban;
    int quien;
    
    public Tenedor(int id){// es un constructor que resive el id de los filosofos 
        this.id = id;
        ban = false;// esta bandera es para el metodo sincronizacion si es verdarera ejecutara el metodo comer
        quien = 10;
    }
    public void tomar(int quien){//metodos que sirve para indicar ala sincronisacion el tenedor que a sido tomado recive el id del filosofo que lo tomo
        this.quien = quien;
        ban = true;
        notifyAll();
    }
    public void soltar(){//indica cuando el tenedor a sido liberado para que otro filosofo lo tome
        quien = 10;
        ban = false;
        notifyAll();
    }
}