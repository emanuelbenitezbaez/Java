package Practica;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero entero de muchos digitos:");

        int numero = entrada.nextInt();

        System.out.println("El numero de digitos es: " + valueOf(numero).length());

    }


}
