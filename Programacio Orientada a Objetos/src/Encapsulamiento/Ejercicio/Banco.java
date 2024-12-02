package Encapsulamiento.Ejercicio;

public class Banco {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("8796", 1989890, "Emanuel Benitez Baez");

        System.out.println("Estado inicial de la cuenta: " + "\n Numero de cuenta: " + cuenta.getNumeroCuenta() + "\n Saldo: " + cuenta.getSaldo() + "\n Titular: " + cuenta.getTitular());

        //Titular modificado

        cuenta.setTitular("Emanuel");

        System.out.println("Titular modificado :");

        System.out.println("Estado inicial de la cuenta: " + "\n Numero de cuenta: " + cuenta.getNumeroCuenta() + "\n Saldo: " + cuenta.getSaldo() + "\n Titular: " + cuenta.getTitular());

        cuenta.depositar(2896970);

        System.out.println("Estado final de la cuenta: " + "\n Numero de cuenta: " + cuenta.getNumeroCuenta() + "\n Saldo: " + cuenta.getSaldo() + "\n Titular: " + cuenta.getTitular());

    }
}