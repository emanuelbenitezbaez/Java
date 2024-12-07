package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean salir = false;
        double resultado;
        Scanner consola = new Scanner(System.in);

        System.out.println("|-------CALCULADORA-------|");
        while (!salir) {
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");

            System.out.print("Elige una opcion: ");
            var opcion = consola.nextInt();
            System.out.print("Ingrese el primer valor: ");
            var numero1 = consola.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            var numero2 = consola.nextDouble();

            switch (opcion) {
                case 1:

                    resultado = numero1 + numero2;
                    System.out.println("El resultado de sumar " + numero1 + " + " + numero2 + " es: " + resultado);
                    break;
                case 2:

                    resultado = numero1 - numero2;
                    System.out.println("El resultado de restar " + numero1 + " - " + numero2 + " es: " + resultado);
                    break;
                case 3:

                    resultado = numero1 * numero2;
                    System.out.println("El resultado de multiplicar " + numero1 + " * " + numero2 + " es: " + resultado);
                    break;
                case 4:

                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("El resultado de dividir " + numero1 + " / " + numero2 + " es: " + resultado);
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
       // consola.close();
    }
}
