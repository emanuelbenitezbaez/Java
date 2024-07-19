import java.util.Scanner;

public class EjercicioOr {
    public static void main(String[] args) {


        /*
        Sergio quiere asisteir al juego de su hijo pero solo puede si es su dia libre o si esta de vacaciones.
         */
        var consola = new Scanner(System.in);

        System.out.print("Es su dia libre?");
        var tieneLibre = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Esta de vacaciones?:");
        var tieneVacaciones = Boolean.parseBoolean(consola.nextLine());

        
        if(tieneLibre == true || tieneVacaciones == true){
            System.out.println("Puede asistir");
        }else{
            System.out.println("No puede asistir");
        }

    }
}
