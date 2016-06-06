package examenfinalparte1;

/**
 * En esta clase,es donde se declaran los metodos.
 *
 * @author igonzalezcastro
 */
public class Operaciones {

    int i;

    /**
     * Este metodo le pasamos dos valores y realiza una operacion de suma.
     *
     * @param j
     * @param m
     */
    public Operaciones(int j, int m) {
        i = met(j, m);
    }

    /**
     * Este metodo le pasamos dos valores y realiza una operacion de resta.
     *
     * @param j
     */
    public Operaciones(int j) {
        i = met(j, j);
    }

    /**
     * Este metodo iguala el valor a -1.
     */
    public Operaciones() {
        i = -1;
    }

    /**
     * En este metodo le pasamos los valores de x,x1 y nos devuelve el resultado
     * de esa operacion.
     *
     * @param x
     * @param x1
     * @return
     */
    public int met(int x, int x1) {
        return x + x1;
    }
}
