import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Ejercicio #2.
        //
        //Declara un conjunto de cadenas con los valores {"manzana", "plátano", "cereza"}.
        // Utiliza un bucle for-each para verificar si el conjunto contiene el elemento "plátano".
        // Si lo contiene, imprime "El conjunto contiene 'plátano'".

        Set<String> cadenas = new HashSet<>();
        cadenas.add("Manzana");
        cadenas.add("Banasna");
        cadenas.add("Cereza");

        for(String cadena : cadenas){

            System.out.println(cadena);
        }
        boolean contiene = cadenas.contains("Banana");

        if (contiene){
            System.out.println("El conjunto contiene el elemento Banana? " + true);
        } else {
            System.out.println("El conjunto contiene el elemento Banana? " + false);
        }
    }
}