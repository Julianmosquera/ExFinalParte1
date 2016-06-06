package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {

        /**
         * Se crea un objeto de tipo Pirncipal y se le pasan los parametros 10 y
         * 20
         */
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);

        /**
         * Se sum por si mismo devido al segundo constructor
         */
        Principal obj2 = new Principal(10);
        int m = obj2.i;
        System.out.println("Es: " + m);
        
        /**
         * Como se crea sin parametros es -1 ya que es el valor de la i.
         */
        Principal obj3 = new Principal();
        int nn = obj3.i;
        System.out.println("Es: " + nn);
    }
}
