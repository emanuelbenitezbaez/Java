import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        //Obtener promedio de notas ingresadas
        //Se debe pedir cuantas notas desea ingresar

        Scanner consola = new Scanner(System.in);

        System.out.println("Cuantas notas desea ingresar?");
        var entrada = consola.nextInt();

        int [] cantidad_notas = new int[entrada];


        //Cargamos notas

        int contador=0;
        int acumulador=0;
        int resultado;
        for (int i =0; i < entrada;i++){
            System.out.println("Ingrese la nota " + i + ": ");
            cantidad_notas[i] = consola.nextInt();
            acumulador =acumulador +  cantidad_notas[i];
            contador++;
        }

        System.out.println("Cantidad de notas ingresadas: " + entrada);


        for (int i =0; i < entrada;i++){
            System.out.println("Nota "+ i + ": " + cantidad_notas[i]);
        }

        resultado = acumulador / contador;

        System.out.println("Promedio: " + resultado);

    }
}
