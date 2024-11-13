import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Un mapa en Java es una estructura de datos que te permite almacenar pares clave-valor.
        // Imagina un diccionario donde cada palabra (clave) tiene una definición asociada (valor).
        // En un mapa, cada clave es única y está asociada a un único valor.
        Map<String, Integer> edades = new HashMap<>();


                   //CLAVE //Valor
        edades.put("John",  35);
        edades.put("Marie",45);
        edades.put("Ema",35);
        System.out.println("La edad de john es : " + edades.get("John"));
        System.out.println("La edad de marie es : " + edades.get("Marie"));
        System.out.println("La edad de ema es : " + edades.get("Ema"));
        //Modificamos
        edades.put("Ema",22);
        System.out.println("La edad modificada de ema es : " + edades.get("Ema"));

       boolean contieneClave =  edades.containsKey("Ema");
        System.out.println(contieneClave);

        boolean contieneValue =  edades.containsValue(36);
        System.out.println(contieneValue);

        //Eliminar
        edades.remove("John");

        System.out.println("Mapa final : " + edades);
    }
}