import java.util.Scanner;

public class EjercicioCondicional {
    public static void main(String[] args) {

        var cadena1 = "Cadena";
        var cadena2 = "Cadena";
        var consola = new Scanner(System.in);
        System.out.print("Ingrese una cadena:");
        var cadena3 = consola.nextLine();

        //Si ingresamos la misma cadena va a dar como resultado que son distintas porque hacen referencia a una posicion
        //de memoria distinta en cada uno.
        if(cadena1 == cadena3){
            System.out.println("Son iguales(en referencia de memoria).");
        }else {
            System.out.println("Son distintas(en referencia de memoria).");
        }

        


    }
}
