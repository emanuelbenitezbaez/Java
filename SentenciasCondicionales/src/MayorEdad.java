import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        final var mayor_edad = 18;
        if (edad >= mayor_edad ){
            System.out.println("Usted es mayor de edad: Tiene " + edad + " años.");
        }else if (edad < mayor_edad && edad > 0 ){
            System.out.println("Usted es menor de edad: Tiene " + edad + " años.");
        }else {
            System.out.println("Edad incorrecta, ingrese su edad nuevamente.");
        }
    }
}
