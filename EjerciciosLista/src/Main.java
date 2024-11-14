import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Ejercicio #2.
        //
        //Declara una lista de enteros y agrega los valores {5, 10, 15, 20, 25}. Imprime el primer y el último elemento de la lista.

        List<Integer> enteros = new ArrayList<>();
        enteros.add(5);
        enteros.add(10);
        enteros.add(15);
        enteros.add(20);
        enteros.add(25);

        System.out.println("Primer elemento de la lista: " + enteros.getFirst());
        System.out.println("Ultimo elemento de la lista: " + enteros.getLast());

        for (int i = 0; i<1;i++){
            System.out.println("Elementos de la lista : " + enteros);
        }
    }
}