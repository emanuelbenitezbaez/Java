package Practica;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero distinto de 0 para continaur en el bulce: ");
        int cantidad=0;
        cantidad = entrada.nextInt();

        while (cantidad != 0) {
            System.out.println("Ingrese un numero distinto de 0 para continaur en el bulce: ");
            cantidad = entrada.nextInt();

        }

    }
}
