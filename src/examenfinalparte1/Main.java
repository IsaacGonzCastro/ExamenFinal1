package examenfinalparte1;

import java.io.IOException;

/**
 * En la clase main,llamamos a los metodos creados en la otra clase.
 *
 * @author igonzalezcastro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /**
         * Llamamos al primer metodo.
         */
        Operaciones obj = new Operaciones(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        /**
         * llamamos al segundo metodo.
         */
        Operaciones nm = new Operaciones(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        /**
         * Llamamos al tercer metodo.
         */
        Operaciones mn = new Operaciones();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

}
