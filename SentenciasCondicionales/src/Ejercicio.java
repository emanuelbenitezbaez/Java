import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);


        System.out.print("Ingrese su usuario:");
        var users = consola.nextLine();
        System.out.print("Ingrese su contraseña:");
        var password = consola.nextLine();


        var user = "user1";
        var pass = "12345";

        if (password.equals(pass) && users.equals(user)){
            System.out.println("Usuario y contraseña correctos, bienvenido.");
        } else if (password.equals(pass) && !users.equals(user)){
            System.out.println("Usuario incorrecto.");
        } else if ((users.equals(user) && !password.equals(pass))) {
            System.out.println("Contraseña Incorrecta.");

        }else {
            System.out.println("Valores Incorrectos.");
        }


    }
}
