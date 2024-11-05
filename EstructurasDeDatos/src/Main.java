public class Main {
    public static void main(String[] args) {

        //Declaracion de un arreglo
        //Arreglo de 10 enteros
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        //Arreglo de 5 strings
        String [] nombres = {"a","b","c","d","e"};
        // Arreglo que tiene 5 posiciones para ingresar strings.
        // String [] nombres = new String[5];


        for (int i = 0; i< numeros.length;i++){
            System.out.println("Posicion: "+ i + " valor: " +numeros[i]);
        }


        System.out.println("---------------------|   |--------------------");
        for (int i= 0; i < nombres.length;i++){
            System.out.println("Posicion: " + i + " Nombre: " + nombres[i]);
        }
    }
}