import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {


        //Se solicita un programa que pida 2 numeros y devuelva el mayor de ellos.

        var consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo numero:");
        var numero2 = Integer.parseInt(consola.nextLine());

        //condicion ? expresionSiVerdadero : expresionSiFalso
        System.out.println(numero1 > numero2 ? "El mayor es : " + numero1 : "El mayor es : " + numero2);
    }
}
