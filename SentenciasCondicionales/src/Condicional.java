import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        var value = Integer.parseInt(valor.nextLine());

        if (value > 0) {
            System.out.println("El valor ingresado es positivo:" + value);
        } else if (value < 0) {
            System.out.println("El valor ingresado es negativo:" + value);
        }else {
            System.out.println("Valor ingresado es:" + value);
        }
    }
}
