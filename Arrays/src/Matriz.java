
public class Matriz {
    public static void main(String[] args) {
        // Definir el tamaño de la matriz

        final int FILAS =3;
        final int COLUMNAS = 3;
        int[][] matriz = new int[FILAS][COLUMNAS];
        // Asignar valores individualmente
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900;

        for (int i=0;i < FILAS;i++){
                for (int j=0;j < COLUMNAS;j++ ){
                    System.out.println("FILA " + i +" COL "+ j +"--> VALOR: " +matriz[i][j]);
                }
        }


    }
}
