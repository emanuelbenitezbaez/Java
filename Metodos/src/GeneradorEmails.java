import java.util.Scanner;

public class GeneradorEmails {



    static void  generarEmails () {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = consola.next().toLowerCase();
        System.out.println("Ingrese su apellido: ");
        String apellido = consola.next().toLowerCase();

        System.out.println("Email generado: " + nombre +"-"+ apellido + "@email.com");



    }


    public static void main(String[] args) {
         generarEmails();
    }
}
