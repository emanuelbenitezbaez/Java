package Cajero;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        // depositar,retirar,consultar saldo.
        //saldo valor inicial = 10000
        //Si se realiza un retiro, se resta del saldo.
        //Si se realiza un deposito, se suma al saldo.



        Scanner consola = new Scanner(System.in);
        int entrada = 0;
        double deposito ;
        double retiro;
        double saldo= 10000;


        while (entrada!=4){

            System.out.println("Menu: ");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Retirar. ");
            System.out.println("3. Depositar. ");
            System.out.println("4. Salir.");

            System.out.println("Elige una opcion: ");

            entrada = consola.nextInt();


            switch (entrada){
                case 1:
                    System.out.println("Saldo actual: " + saldo);
                    break;
                case 2 :

                    System.out.println("Ingrese monto a retirar: ");
                    retiro = consola.nextDouble();
                    saldo = saldo - retiro;
                    System.out.println("Monto a retirar: " + retiro);
                    System.out.println("Saldo actual:" + saldo);
                    break;
                case 3 :
                    System.out.println("Ingrese monto a depositar: ");
                    deposito = consola.nextDouble();
                    saldo= saldo + deposito;
                    System.out.println("Monto ha depositar : " + deposito);
                    System.out.println("Su nuevo saldo es: " + saldo);
                    break;
                case 4:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }

    }
}
