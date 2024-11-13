import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Para trabajar con listas debo importar una libreria.
        // java.util.ArrayList;
        // Una lista puede contener diferentes tipos de datos y tiene un tamaño dinamico
        // Puedo usar metodos especificos.
        List<String> misCadenas = new ArrayList<>();
        misCadenas.add("Hola");

        misCadenas.add("Como");

        misCadenas.add("estas?");
        System.out.println("Primer cadena: " + misCadenas);
        System.out.println("Valor obtenido de la posicion 1 de la cadena:  " + misCadenas.get(1));
        misCadenas.set(2,"va?");
        System.out.println("Cadena nueva modificada : " + misCadenas);

        misCadenas.remove(0);
        System.out.println("Cadena despues de eliminar elemento:" + misCadenas);
        System.out.println("Tamaño de la cadena despues de eliminar un elemento: " + misCadenas.size());
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