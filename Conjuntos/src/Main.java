import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Un conjunto en Java (Set) es una colección que no permite elementos duplicados.
        //Es decir, cada elemento dentro de un conjunto debe ser único.
        // Esta característica lo distingue de otras colecciones como las listas, donde se permiten repeticiones.

        Set<String> frutas = new HashSet<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("pera");
        frutas.add("manzana"); // Se ignora porque ya existe
        frutas.add("naranja");

        System.out.println(frutas); // Imprime: [banana, manzana, pera,naranja] (el orden puede variar)
        System.out.println("Tamaño del conjunto: " + frutas.size());


    }
}