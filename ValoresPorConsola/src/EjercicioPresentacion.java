import java.util.Scanner;

public class EjercicioPresentacion {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre:");
        var nombre = scanner.nextLine();


        System.out.print("Ingrese su edad:");
        var edad = Integer.parseInt(scanner.nextLine());


        System.out.print("Ingrese hij@:");
        var hijo = Boolean.parseBoolean(scanner.nextLine());


        System.out.print("Ingrese su bebida favorita:");
        var bebida = scanner.nextLine();


        System.out.print("Ingrese el precio de su bebida favorita:");
        var precioBebida = Float.parseFloat(scanner.nextLine());

        System.out.println("PRESENTACION:");


        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Hijo unico:" + hijo);
        System.out.println("Bebida Favorita:" + bebida);
        System.out.println("Precio Bebida:" + precioBebida);
    }
}
