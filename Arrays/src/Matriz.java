public class Matriz {
    public static void main(String[] args) {
        // Definir el tamaño de la matriz
        int[][] matriz = new int[3][3];
        // Asignar valores individualmente
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println("Matriz [0][0] : "+ matriz[0][0]);
        System.out.println("Matriz [0][1] : "+ matriz[0][1]);
        System.out.println("Matriz [0][2] : "+ matriz[0][2]);
        System.out.println("Matriz [1][0] : "+ matriz[1][0]);
        System.out.println("Matriz [1][1] : "+ matriz[1][1]);
        System.out.println("Matriz [1][2] : "+ matriz[1][2]);
        System.out.println("Matriz [2][0] : "+ matriz[2][0]);
        System.out.println("Matriz [2][1] : "+ matriz[2][1]);
        System.out.println("Matriz [2][2] : "+ matriz[2][2]);
    }
}
