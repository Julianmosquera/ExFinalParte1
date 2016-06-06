package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
       
        
       /**
        * Se crea un objeto de tipo Pirncipal y se le pasan los parametros 10 y 20
        */
        Principal obj = new Principal(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        
        /**
         * Se sum por si mismo devido al segundo constructor
         */
        Principal nm = new Principal(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        
        
        
        Principal mn = new Principal();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
