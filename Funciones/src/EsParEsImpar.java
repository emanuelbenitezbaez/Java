import java.util.Scanner;

public class EsParEsImpar {
    //Funciones

    static public void esPar (int numero) {
        if (numero%2 == 0){
            System.out.println("El numero "+ numero + " es par.");
        }else {
            System.out.println("El numero "+ numero + " es impar.");
        }
    }



    public static void main(String[] args) {

        //Solicitar numero
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        var numero = consola.nextInt();
        //Llamada a la funcion
        esPar(numero);
    }
}
