import java.util.Scanner;

public class SentenciasCondicionales {
    public static void main(String[] args) {



        Scanner edad = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        var mayoriaEdad = Integer.parseInt(edad.nextLine());
        if (mayoriaEdad >= 18){
            System.out.println("Usted es mayor y puede ingresar al bar.!");
        } else if (mayoriaEdad < 18) {
            System.out.println("Usted no tiene la mayoria de edad.!");
        } else{
            System.out.println("La edad ingresada es incorrecta, intente nuevamente.!");
        }
    }
}
