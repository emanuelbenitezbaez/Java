package Encapsulamiento.Ejercicio;

public class CuentaBancaria {
    //Crea un programa para modelar una cuenta bancaria con las siguientes características:
    //Clase CuentaBancaria:
    //Contiene las propiedades privadas:
    //numeroCuenta (de tipo String): Representa el número único de la cuenta.
    //saldo (de tipo double): Representa el saldo actual de la cuenta.
    //titular (de tipo String): Representa el nombre del titular de la cuenta.
    //Proporciona los métodos públicos:
    //Getters para obtener los valores de numeroCuenta, saldo y titular.
    //Setter para modificar el valor de titular.
    //Un método llamado depositar(double cantidad) que permita agregar una cantidad al saldo de la cuenta. Si la cantidad es negativa, no se debe modificar el saldo.
    //Clase Banco:
    //En esta clase principal, crea un objeto de la clase CuentaBancaria.
    //Asigna valores iniciales al número de cuenta, saldo y titular utilizando un constructor.
    //Muestra el estado inicial de la cuenta en la consola.

    //Modifica el nombre del titular y realiza un depósito utilizando los métodos proporcionados.
    //Muestra el estado final de la cuenta.
    //Requisitos
    //Implementa correctamente la encapsulación usando modificadores de acceso (private y public).
    //Asegúrate de que el método depositar no acepte valores negativos.
    //Muestra los valores en la consola con mensajes claros y descriptivos.

    //atributos
    private final String numeroCuenta;
    private double saldo;
    private String titular;


    //constructor

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //metodos


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double cantidad){

        if (cantidad>0){
            saldo = cantidad;
        }else {
            System.out.println("No se puede depositar una cantidad negativa.");
        }

    }
}
