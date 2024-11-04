import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Declara una variable edad y utiliza estructuras if-else if-else
        * para imprimir la categoría de edad según la siguiente tabla:
        0-12: Niño
        13-17: Adolescente
        18-64: Adulto
        65 en adelante: Adulto mayor
        */

        System.out.println("Ingrese su edad: ");
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();

        if(edad > 0 && edad < 12){
            System.out.println("Usted es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Usted es un Adolescente. ");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Usted es un adulto. ");
        } else if (edad >= 65) {
            System.out.println("Usted es un adulto mayor. ");
        }else{
            System.out.println("Edad incorrecta, intente de nuevo.");
        }


    }
}