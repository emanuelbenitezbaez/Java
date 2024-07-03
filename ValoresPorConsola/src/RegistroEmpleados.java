import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        System.out.println("REGISTRO DE EMPLEADO");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre:");
        var nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        var edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese su sueldo:");
        var sueldo = Float.parseFloat(scanner.nextLine());

        System.out.print("Eres un empleado de confianza?(true/false)");
        var confianza = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("INFORMACION PROPORCIONADA:");

        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Eres un empleado de confianza?: " + confianza);


    }
}
