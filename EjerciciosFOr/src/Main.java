import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Ejercicio #1.

        //Declara una lista de cadenas con los valores {"rojo", "verde", "azul", "amarillo"}.
        //Utiliza un bucle for para contar el número de elementos en la lista e imprime el resultado.

        List<String> cadenas = new ArrayList<>();
        cadenas.add("Rojo");
        cadenas.add("Verde");
        cadenas.add("Azul");
        cadenas.add("Amarillo");


        System.out.println("Elementos:");
        int contador = 0;
        for( String cadena : cadenas){
            System.out.println(cadena);
            contador ++;
        }


        System.out.println("Cantidad de elementos en la lista: " + contador);
    }
}