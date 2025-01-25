package PracticaMetodos;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class GeneradorId {

    static void generarId () {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa tu numbre: ");
        String nombre = consola.next();
        System.out.println("Ingresa tu apellido: ");
        String apellido = consola.next();
        System.out.println("Ingrese año de nacimiento:");
        String anioNacimiento = consola.next();

        var name = nombre.substring(0,2);
        var surname = apellido.substring(0,2);

        var bornAge = anioNacimiento.substring(2,4);

        Random random = new Random();
        int aleatorio = random.nextInt(0, 9999);

        var patron = "####";
        DecimalFormat decimalFormat = new DecimalFormat(patron);
        var numeroFormateado = decimalFormat.format(aleatorio);

        System.out.println("Tu ID es : " +name.toUpperCase() + surname.toUpperCase() + bornAge + numeroFormateado);


    }

    public static void main(String[] args) {
        //Crear funcion para generar un id unico con las siguientes caracteristicas:
        //1- Nombre: toma los 2 primeros caracteres.
        //2- Apellido: toma los 2 primeros caracteres.
        //Aplicar to upper case a los 2 anteriores
        //3- Año Nacimiento en formato YYYY : toma los 2 ultimos caracteres.
        //4- Valor aleatorio de 4 digitos: dar formato "####"

            generarId();
    }
}
