package examenfinalparte1;

public class Principal {

    int i;

    /**
     * Constructor que usa el método suma con dos parametros que se le pasa.
     * @param j
     * @param m 
     */
    public Principal(int j, int m) {
        i = Suma(j, m);
    }

    /**
     * Usa tabien el método suma para sumar el un solo parametro sobre si mismo
     * @param j 
     */
    public  Principal(int j) {
        i = Suma(j, j);
    }

    /**
     * Iguala la variable i a menos 1
     */
    public  Principal() {
        i = -1;
    }

    /**
     * Es un metodo para sumar
     * @param x
     * @param x1
     * @return 
     */
    public int Suma(int x, int x1) {
        return x + x1;
    }
}
