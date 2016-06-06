package examenfinalparte1;

/**
 * En esta clase,es donde se declaran los metodos.
 * @author igonzalezcastro
 */
public class Principal {

    int i;

    /**
     *Este metodo le pasamos dos valores y realiza una operacion de suma.
     * @param j
     * @param m
     */
    public Principal(int j, int m) {
        i = Operacion(j, m);
    }

    /**
     *Este metodo le pasamos dos valores y realiza una operacion de resta.
     * @param j
     */
    public Principal(int j) {
        i = Operacion(j, j);
    }

    /**
     *Este metodo iguala el valor a -1.
     */
    public Principal() {
        i = -1;
    }

    /**
     * En este metodo le pasamos los valores de x,x1 y nos devuelve el resultado de esa operacion.
     * @param x
     * @param x1
     * @return
     */
    public int Operacion(int x, int x1) {
        return x + x1;
    }
}
