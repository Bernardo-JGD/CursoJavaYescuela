/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

/**
 *
 * @author ana_e
 */
public class Filosofos {

    public static void main(String args[]) {
        Filosofo comensales[];// se crea un arreglo de tipo filosofo
        comensales = new Filosofo[5]; // se hace para 5 persoans en la mesa
        Tenedor mesa[];// se crea un arreglo de los tenedores que viene sinedo la mesa
        mesa = new Tenedor[5];// para sinco personas con su stenedores
        int i, izq = 0, der = 0;
        for (i = 0; i < 5; i++) {// este ciclo se ejecuta 5 veces
            mesa[i] = new Tenedor(i);// sirve para indicar que la mesa hay 5 personas en el 
        }
        for (i = 0; i < 5; i++) {// el ciclo recorre  5 veces 
            // en los if se deve considerar que es el numero que tiene +1 para indicar el numero de tenedor de la persona
            if (i == 0) {// si la 1 == a 0 el filosofo uno tomara el ultimo renglon y el primero
                izq = 4;
                der = 0;

            }
            if (i == 1) {//si es i=1 tomara el tenedor primero y el segundo 
                izq = 0;
                der = 1;
            }
            if (i == 2) {// si i=2 tomara el tenedor 2 con la mano izquierda y tenedor 3 con la mano derecha
                izq = 1;
                der = 2;
            }
            if (i == 3) {//si i=3 tomara el tenedor 3 con la mano izquierda y tenedor 4 con la mano derecha
                izq = 2;
                der = 3;
            }
            if (i == 4) {//si i=4 tomara el tenedor 4 con la mano izquierda y tenedor 5 con la mano derecha
                izq = 3;
                der = 4;
            }
            comensales[i] = new Filosofo(i, mesa[izq], mesa[der], mesa);// se crea un objeto de comensales  y sele envia los datos de los 5 filosofos, aqui es donde indico que tenedores son los que puede tomar cada filosofo
        }

        Tenedor objt = new Tenedor(1);
        Tenedor art[] = new Tenedor[0];
        Filosofo objf = new Filosofo(1, objt, objt, art);
        objf.setVisible(true);
    }
}
