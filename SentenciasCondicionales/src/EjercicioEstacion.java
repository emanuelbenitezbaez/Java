import java.util.Scanner;

public class EjercicioEstacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el valor numerico de un mes (1-12):");

        var valor = Integer.parseInt(consola.nextLine());

        if(valor == 1 || valor == 2 || valor == 12) {
            System.out.println("La estacion para el valor "+ valor + " es : Invierno");
        }else if(valor == 3 || valor == 4 || valor == 5 ){
            System.out.println("La estacion para el valor "+ valor + " es : Primavera");
        }else if(valor == 6 || valor ==7 || valor == 8  ){
            System.out.println("La estacion para el valor "+ valor + " es : Otoño");
        }else if(valor == 9 || valor == 10 || valor == 11){
            System.out.println("La estacion para el valor "+ valor + " es : Verano");
        }else  {
            System.out.println("La estacion para el valor "+ valor + " es invalida, intente nuevamente.");
        }

    }
}
