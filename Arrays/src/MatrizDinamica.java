import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Ingresar valores en la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

