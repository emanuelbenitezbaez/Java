package Practica;

import java.util.Scanner;



public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        * Entrada: Una secuencia de números enteros positivos que termina en 0.

Tarea: Obtener la suma de aquellos números cuya cantidad de cifras sea igual a la suma de esas mismas cifras.

Restricción: No se pueden utilizar arrays.

Ejemplo de entrada: 1, -111, 5, 111, 66, 201, 27, 0

Salida esperada: 1 + 111 + 201 = 313
        * */


        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        int total = 0;
        int numero ;

         do {


             System.out.println("Ingrese numeros enteros y termine con 0:");
             numero = entrada.nextInt();
             int cifras= 1;
             int suma = numero % 10;
             int aux = numero;

             while (aux>9){
                 aux = aux / 10;
                 suma += aux % 10;
                 cifras++;
             }
             if (cifras == suma){
                 resultado += numero + " + ";
                 total += numero;
             }

         }while (numero != 0);
        System.out.println("La suma de los numeros cuya cantidad de cifras sea igual a la suma de esas mismas cifras es: " + resultado + " = " + total);




    }
}
