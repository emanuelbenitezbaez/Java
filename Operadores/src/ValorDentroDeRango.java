import java.util.Scanner;

public class ValorDentroDeRango {
    public static void main(String[] args) {

        System.out.println("VALOR DENTRO DE RANGO");

        final int VALOR_INICIAL =1;
        final int VALOR_FINAL = 10;

        Scanner valorIngresado = new Scanner(System.in);
        System.out.print("Ingrese un valor entre 1 y 10: ");
        var valor = Integer.parseInt(valorIngresado.nextLine());

        boolean resultado = valor >= VALOR_INICIAL && valor <= VALOR_FINAL;


        System.out.println("VALOR DENTRO DE RANGO:" + resultado);


    }
}
