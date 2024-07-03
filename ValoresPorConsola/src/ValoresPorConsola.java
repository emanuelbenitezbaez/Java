import java.util.Scanner;

public class ValoresPorConsola {
    public static void main(String[] args) {
        //INTRODUCIR VALORES POR CONSOLA.
        Scanner scanner = new Scanner(System.in);//IN: input- entrada de datos.
        System.out.println("Escribe tu nombre:");

        var nombre = scanner.nextLine();

        System.out.println("Usuario: " + nombre);

    }
}
