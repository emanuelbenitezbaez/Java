import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Ejercicio #3.
        //
        //Declara un mapa de cadenas a enteros y agrega los pares clave-valor {"manzana": 3, "plátano": 5, "cereza": 10}.
        //Modifica el valor asociado a "plátano" para que sea 7. Imprime todos los pares clave-valor del mapa.

        //Clave cadena : valor enteros
        Map<String,Integer> frutas = new HashMap<>();

        frutas.put("Manzana",3);
        frutas.put("Banana",5);
        frutas.put("Cereza",10);

        System.out.println("Primer mapa: "+frutas);

        frutas.put("Uvas",12);
        System.out.println("Agregamos un clave valor: " + frutas);
        frutas.put("Banana",7);
        System.out.println("Modificamos un elemento : "+frutas);
        frutas.remove("Uvas");
        System.out.println("Borramos un elemento : "+frutas);
    }
}