package examenfinalparte1;

import java.io.IOException;

/**
 *En la clase main,llamamos a los metodos creados en la otra clase.
 * @author igonzalezcastro
 */
public class Prin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }

}
