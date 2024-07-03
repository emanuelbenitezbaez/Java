import java.util.Scanner;

public class ConversionDeTiposDeDatos {
    public static void main(String[] args) {

        Scanner numeroIngresado1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        //nextLine() siempre devuelve un cadena
        var numero1 = Integer.parseInt(numeroIngresado1.nextLine()) ;

        //Si quiero un numero, tengo que parsear Integer.parseInt(numerIngresado1.nextLine())
        Scanner numeroIngresado2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero:");
        var numero2 = Integer.parseInt(numeroIngresado2.nextLine()) ;//nextLine() siempre devuelve un cadena.


        var resultado = numero1 + numero2;

        System.out.println("Resultado: " + resultado);
    }
}
