public class Main {
    public static void main(String[] args) {

        String cadena = "Soy una cadena de texcto";
        String cadena2 = "Learning Java con Emanuel";
         char res = cadena.charAt(2);

        System.out.println("Caracter de la posicion : " + res);

        String palabra = cadena.substring(4,10);
        System.out.println("Substring devuelto: " + palabra);



        String palabra2 = cadena2.toUpperCase();
        System.out.println(palabra2);

        int longitud = cadena2.length();
        System.out.println("Longitud de la cadena 2: " +longitud);

        String palabraMinuscula = cadena2.toLowerCase();
        System.out.println(palabraMinuscula);

        boolean contiene = cadena2.contains("java");
        System.out.println("La cadena 2 contiene la palabra ´Java´ ?:" +contiene);

        int indice_palabra = cadena2.indexOf("Java");

        System.out.println("El indice de la palabra es : " + indice_palabra);

        String reemplazar = cadena2.replace("con","by");
        System.out.println(reemplazar);

    }
}