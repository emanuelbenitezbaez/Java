package Practica;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros que quiere ingresar: ");
        int cantidad = entrada.nextInt();
        int contador = 0;
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = entrada.nextInt();
            if (contador == 0) {
                maximo = numero;
                minimo = numero;
            } else {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
            contador++;
        }
        System.out.println("El numero mayor es: " + maximo);
        System.out.println("El numero menor es: " + minimo);
        System.out.println("La cantidad de numeros ingresados es: " + contador);
    }
}
