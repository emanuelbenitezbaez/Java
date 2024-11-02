import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Solicitamos datos al usuario.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese como esta el clima hoy en su ciudad:");
        //Guardamos dato ingresado.
        String clima_dia = entrada.nextLine();
        //Imprimimos dato ingresado.
        System.out.println(clima_dia);


    }
}