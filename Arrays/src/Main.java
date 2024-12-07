
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //El array es un tipo de dato que contiene datos del mismo tipo.
        //El array se puede modificar

        int [] arrays = {1,2,3,4,5,6,7,8,9};

        for (int array : arrays) {
            System.out.println("Arrays: " + array);
        }

        String [] cadena= {"ygfg","ujhiuh","yhgy","hgfug","pvrxtr"};

        for (String s : cadena) {
            System.out.println("Cadenas: " + s);
        }



        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos a ingresar:");
        var cantidad_elementos = consola.nextInt();

        int[] elementos = new int[cantidad_elementos];

        for (int i = 0; i < cantidad_elementos; i++) {
            System.out.println("Ingrese el elemento en el índice " + i + ": ");
            elementos[i] = consola.nextInt();
        }

        for (int i = 0; i < cantidad_elementos; i++) {
            System.out.println("Elemento en el índice " + i + ": " + elementos[i]);
        }
    }
}