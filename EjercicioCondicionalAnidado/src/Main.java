import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
Declara una variable mes con un valor entre 1 y 12.
Utiliza estructuras if-else if-else para imprimir la estación del año según la siguiente tabla:
12, 1, 2: Invierno
3, 4, 5: Primavera
6, 7, 8: Verano
9, 10, 11: Otoño
        * */
        System.out.println("Porfavor ingrese el numero de mes (1 - 12) que desea consultar: ");
        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();
        if(mes == 1 || mes == 2 || mes == 12){
            System.out.println("Usted ha ingresado en mes "+ mes + " y corresponde a la estacion Invierno");
        } else if (mes==3 || mes == 4 || mes == 5) {
            System.out.println("Usted ha ingresado en mes "+ mes + " y corresponde a la estacion Primavera");
        } else if (mes==6 || mes == 7 || mes == 8) {
            System.out.println("Usted ha ingresado en mes "+ mes + " y corresponde a la estacion Verano");
        } else if (mes==9 || mes == 10 || mes == 11) {
            System.out.println("Usted ha ingresado en mes "+ mes + " y corresponde a la estacion Otoño");
        }else{
            System.out.println("Error!El numero ingresado no corresponde a ningun mes. Intente de nuevo.");
        }
    }
}