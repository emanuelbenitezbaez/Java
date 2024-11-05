import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Para trabajar con listas debo importar una libreria.
        // java.util.ArrayList;

        // Declaracion de lista
        List<Integer> miLista = new ArrayList<>();

        miLista.add(1);
        miLista.add(2);
        miLista.add(345);
        //Imprime todos los elementos de la lista
        System.out.println("Elementos de la listas: " + miLista);

        //Imprime un elemento de la lista (elemento del indice  2)
        System.out.println("Elemento del indice 2 de la lista: " +miLista.get(2));

        //Agregamos un nuevo elemento a la lista
        miLista.add(234);

        System.out.println("Elementos de la listas: " + miLista);

        //Modificamos un elemento de la lista

        miLista.set(1,768);
        System.out.println("Elemento modificado de la lista en el primer indice: " + miLista.get(1));

        System.out.println("Elementos de la lista nueva: " + miLista);
    }
}