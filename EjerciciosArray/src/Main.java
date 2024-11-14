public class Main {
    public static void main(String[] args) {

        //Ejercicio #1.

        //Declara un array de enteros de tamaño 4. Inicializa cada elemento del array con los valores 2, 4, 6 y 8.
        // Imprime los elementos del array.

        int [] numeros = new int[4];
        numeros[0]=2;
        numeros[1]=4;
        numeros[2]=6;
        numeros[3]=8;

        System.out.println("Numero en el indice 0 : " + numeros[0]);
        System.out.println("Numero en el indice 1 : " + numeros[1]);
        System.out.println("Numero en el indice 2 : " + numeros[2]);
        System.out.println("Numero en el indice 3 : " + numeros[3]);

        for (int i = 0; i < numeros.length;i++){
            System.out.println("Numero en el indice " + i + " : " +numeros[i]);
        }
    }
}