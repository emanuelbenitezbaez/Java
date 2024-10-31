public class Main {
    public static void main(String[] args) {

        String cadena = "Soy una cadena de texcto";
         char res = cadena.charAt(2);

        System.out.println("Caracter de la posicion : " + res);

        String palabra = cadena.substring(4,10);
        System.out.println("Substring devuelto: " + palabra);
    }
}