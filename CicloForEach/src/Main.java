import java.util.*;

public class Main {
    public static void main(String[] args) {

        //¡Claro! Con gusto te explico el bucle forEach en Java.
        //
        //El bucle forEach en Java: Una forma más sencilla de iterar
        //El bucle forEach es una característica introducida en Java 8 que nos permite iterar sobre los elementos
        // de una colección (como arrays, listas, sets, etc.) de una manera más concisa y legible en comparación con el bucle for tradicional.

        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        List<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("pera");

        //frutas.forEach(fruta -> System.out.println(fruta));
        for(String fruta:frutas){
            System.out.println(fruta);
        }

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 30);
        edades.put("Ana", 25);
        edades.put("Pedro", 35);

        edades.forEach((nombre, edad) -> {
            System.out.println(nombre + ": " + edad);
        });

        Set<String> colores = new HashSet<>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");


       //colores.forEach(color -> System.out.println(color));
        for(String color:colores){
            System.out.println(color);
        }
    }
}