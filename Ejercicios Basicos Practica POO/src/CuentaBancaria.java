public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
         this.saldo= saldo + cantidad;
    }
    public void retirar(double cantidad) {
        if(cantidad>0){
             this.saldo= saldo - cantidad;
        }else {
            System.out.println("No permite retirar saldo negativo.");
        }


    }
    public double consultarSaldo() {
        return this.saldo;
    }



}
