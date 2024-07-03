import java.util.Scanner;

public class DetalleLibro {
    public static void main(String[] args) {

        Scanner nombreLibro = new Scanner(System.in);
        System.out.print("Ingrese el nombre del libro: ");
        var libro = nombreLibro.nextLine();

        Scanner nombreAutor = new Scanner(System.in);
        System.out.print("Ingrese el nombre del autor:");
        var autor = nombreAutor.nextLine();

        System.out.println(" El libro " + libro + " fue escrito por " + autor);

    }
}
