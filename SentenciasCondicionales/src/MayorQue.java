import java.util.Scanner;

public class MayorQue {
    public static void main(String[] args) {
        //Se solicita un programa que pida 2 numeros y devuelva el mayor de ellos.

        var consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo numero:");
        var numero2 = Integer.parseInt(consola.nextLine());

        if(numero1 > numero2) {
            System.out.println("El numero mayor : " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("Ambos son iguales: " + numero2 + " es igual que "+ numero1);
        }
    }
}
