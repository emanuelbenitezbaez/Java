public class Main {
    public static void main(String[] args) {

        /*
        * Ejercicio #1.

Dada la cadena "Programar en Java es emocionante", realiza las siguientes tareas:
Obtén el carácter en la posición 10.
Reemplaza "emocionante" por "genial".
Convierte la cadena a minúsculas.
Verifica si la cadena contiene "Programar".
Imprime los resultados en la consola.

Ejercicio #2.

Dado el nombre completo "Juan Pérez Rodríguez", realiza las siguientes tareas:
Extrae el primer nombre.
Extrae el primer apellido.
Obtén el primer carácter del segundo apellido.

        *
        */
        String cadena = "Programar en Java es emocionante";
        char char_position = cadena.charAt(10);
        System.out.println("Caracter en la posicion 10 es : " + char_position);

        String palabra_reemplazada = cadena.replace("emocionante","genial");
        System.out.println("Palabra reemplazada : " + palabra_reemplazada);

        String cadena_minuscula = cadena.toLowerCase();
        System.out.println("String Convertido a minuscula : " +cadena_minuscula);

        boolean contiene = cadena.contains("Programar");
        System.out.println("La cadena contiene la palabra programar? " + contiene);

        String nombre_completo = "Juan Pérez Rodríguez";
        String nombre_extraido = nombre_completo.substring(0,5);
        System.out.println("Nombre extraido: " + nombre_extraido);

        String primer_apellido_extraido = nombre_completo.substring(5,11);
        System.out.println("Nombre extraido: " + primer_apellido_extraido);

        char caracter_segundo_apellido = nombre_completo.charAt(11);
        System.out.println("Primer caracter del segundo apellido: " + caracter_segundo_apellido);
    }
}