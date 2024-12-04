package MenuInteractivo;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int entrada  = 0;
        while (entrada !=3){

            System.out.println("Menu:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Salir sistema");

            System.out.print("Ingrese una opcion: ");
            entrada = consola.nextInt();

        }
        System.out.println("Finalizando Programa....");
    }
}
