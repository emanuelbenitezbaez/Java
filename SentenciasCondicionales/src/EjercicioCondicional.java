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
        //PARA COMPARAR DEBEMOS USAR EL METODO EQUALS(METODO DE LA CLASE STRING)
        //COMPARAMOS EL CONTENIDO Y NO LA REFERENCIA



        if (cadena1.equals(cadena3)){
            System.out.println("Son iguales(en valor).");
        }else {
            System.out.println("Son distintas(en valor).");
        }
        //TENER EN CUENTA QUE JAVA ES CASE SENSITIVE Y NO ES LO MISMO CADENA QUE Cadena.

        if (cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("Son iguales(en valor).");
        }else {
            System.out.println("Son distintas(en valor equalsIgnoreCase).");
        }
    }
}
