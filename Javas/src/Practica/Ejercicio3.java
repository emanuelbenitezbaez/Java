package Practica;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        * Programa que pida numeros enteros hasta que se ingrese 0.
        * Mostrar la suma total de todos los numeros ingresados.
        *
        * */

        Scanner entrada = new Scanner(System.in);
        int numero ;
        int acumulador=0;


        System.out.println("Ingrese un numero entero:");
        numero = entrada.nextInt();

        while (numero != 0) {

            acumulador = acumulador + numero;
            System.out.println("Ingrese un numero entero:");
            numero = entrada.nextInt();

        }
        System.out.println("La suma total de los numeros ingresados es: "+acumulador);


        /*
        do {
            System.out.println("Ingrese un numero entero:");
            numero = entrada.nextInt();
            acumulador = acumulador + numero;
        }while (numero != 0);
        System.out.println("La suma total de los numeros ingresados es: "+acumulador);
        */
    }
}
