public class Comparacion {
    public static void main(String[] args) {
        System.out.println("OPERADORES DE COMPARACION");
        System.out.println("Estos operadores se utilizan para comparar dos valores.");

        System.out.println("Igual a (==): Comprueba si dos operandos son iguales.");
        int a = 5;
        int b = 5;
        boolean igual = (a == b);  // igual será true
        System.out.println("a:5 == b:5: " + igual);

        System.out.println("No igual a (!=): Comprueba si dos operandos no son iguales.");
        int a1 = 5;
        int b1 = 3;
        boolean noIgual = (a1 != b1);  // noIgual será true
        System.out.println("a1:5 != b1:3 : " + noIgual);

        System.out.println("Mayor que (>): Comprueba si el operando de la izquierda es mayor que el de la derecha.");
        int a2 = 5;
        int b2 = 3;
        boolean mayorQue = (a2 > b2);  // mayorQue será true
        System.out.println("a2:5 > b2:3 : " +mayorQue);

        System.out.println("Menor que (<): Comprueba si el operando de la izquierda es menor que el de la derecha.");
        int a3 = 5;
        int b3 = 3;
        boolean menorQue = (a3 < b3);  // menorQue será false
        System.out.println("a3:5 < b3:3 : " +menorQue);
    }
}
