import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Pedir datos
        Scanner entry = new Scanner(System.in);
        System.out.println("cuantas notas quiere ingresar?");
        int cantidad_notas = entry.nextInt();

        //Declaracion de arreglo que le pasamos la cantidad de notas que va a ingresar el usuario.
        double [] notas = new double[cantidad_notas];
        double suma= 0;
        double promedio = 0;

        //Carga de notas en el arreglo.
        for(int i = 0;i < cantidad_notas; i++){
            System.out.println("Ingrese nota:");
            notas[i] = entry.nextDouble();

        }

        // Suma de notas
        for(int i= 0; i< cantidad_notas;i++){
            suma +=  notas[i];
        }

        promedio = suma / cantidad_notas;

        System.out.println("Promedio: " + promedio);

    }
}