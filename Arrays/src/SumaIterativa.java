public class SumaIterativa {
    public static void main(String[] args) {

        //SUMA ITERATIVA
        //Realizar la suma en diagonal de las posiciones [0][0],[1][1],[2][2].

        int [][] matriz ={
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
        int acumulador=0;
        for (int x = 0;x < matriz.length;x++ ){

            for (int y = 0;y < matriz[x].length;y++){
                if (matriz[x]==matriz[y]){
                acumulador= acumulador + matriz[x][y];
                }
                System.out.println("X " + x +" Y "+ y +"--> VALOR: " + matriz[x][y]);
            }


        }
        System.out.println("Suma en diagonal : " + acumulador);
    }
}
