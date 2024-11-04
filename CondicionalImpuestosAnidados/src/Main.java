import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio #4.
        Declara una variable ingreso y una variable numeroDependientes.
        Utiliza condicionales anidados para determinar la categoría de impuestos:
        Si el ingreso es menor de 20000, la tasa es del 10%.
        Si el ingreso es mayor o igual a 20000 y menor de 50000:
        Si tiene más de 3 dependientes, la tasa es del 15%.
        Si tiene 3 o menos dependientes, la tasa es del 20%.
        Si el ingreso es mayor o igual a 50000, la tasa es del 30%.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su ingreso: ");
        double ingreso = entrada.nextDouble();

        System.out.println("Numero dependiente?: ");
        int numero_dependiente = entrada.nextInt();


        if (ingreso < 20000){
            System.out.println("La tasa es del 10%");
        }else if (ingreso >= 20000 && ingreso < 50000){
            if (numero_dependiente >3){
                System.out.println("La tasa es del 15%");
            } else if (numero_dependiente <= 3) {
                System.out.println("La tasa es del 20%");
            }
        } else if (ingreso >= 50000) {
            System.out.println("La tasa es del 30%");
        }


    }
}