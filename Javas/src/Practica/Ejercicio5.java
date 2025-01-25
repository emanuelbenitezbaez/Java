package Practica;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Crea un programa que pida una cadena y las muestre separadas.
        //Por ejemplo, si la cadena es "Hola", mostrará "H o l a".


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String str = entrada.nextLine();
        for (int i = 0; i < str.length(); i++) {

            System.out.print( str.charAt(i) + " ");
        }

    }
}
