public class Ejercicio2 {
    public static void main(String[] args) {
        /*Enunciado: Diseña una clase CuentaBancaria con los atributos titular (String) y saldo (double).
        Implementa un constructor que reciba el titular y el saldo inicial (si no se proporciona saldo,
        se inicializa a 0). Crea los métodos ingresar(double cantidad) (que aumenta el saldo), retirar(double cantidad)
        (que disminuye el saldo, pero no permite saldos negativos) y consultarSaldo() (que devuelve el saldo actual).
        */
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos",0);
        cuenta1.ingresar(9011123);
        cuenta1.retirar(1112);
        System.out.println(" Saldo actual: " +cuenta1.consultarSaldo());

    }
}
