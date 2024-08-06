import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        /*
        SISTEMA DE CALICIFICACIONES:
        Crear un programa para convertir una calificacion numerica (1 - 10)
        a una letra de (A - F);
         */
        // Si es mayor o igual a 9 y menor o igual a 10 (A)
        // si es mayor o igual  a 8 y menor a 9 (B)
        //Si es mayor o igual a a 7 y menor a 8 (C)
        //Si es mayor o igual a a 6 y menor  a 7 (D)
        //Si es mayor o igual a a 0 y menor  a 6 (F)
        //casp contrario imprimir mensaje.

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su calificacion numerica::");
        //var calificacion = Integer.parseInt(consola.nextLine());
        var calificacion = Double.parseDouble(consola.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Su calificacion es A");
        }else if (calificacion >= 8 && calificacion <9){
            System.out.println("Su calificacion es B");
        } else if (calificacion>=7 && calificacion < 8) {
            System.out.println("Su calificion es C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Su calificacion es D");
        } else if (calificacion >= 0 && calificacion < 6){
            System.out.println("Su calificacion es F");
        } else {
            System.out.println("Calificacion incorrecta, Intente nuevamente.");
        }


    }
}
