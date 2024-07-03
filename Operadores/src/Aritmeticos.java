public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println("OPERADORES ARITMETICOS");
        System.out.println("Estos operadores se utilizan para realizar operaciones matemáticas básicas.");
        System.out.println("Suma (+): Suma dos operandos.");
        int a = 5;
        int b = 3;
        int suma = a + b;  // suma será 8
        System.out.println("A:5 + B:3 "+ suma);

        System.out.println("Resta (-): Resta el segundo operando del primero.");
        int a1 = 5;
        int b1 = 3;
        int resta = a1 - b1;  // resta será 2
        System.out.println("A1:5 - B1:3 : "+ resta);

        System.out.println("Multiplicación (*): Multiplica dos operandos.");
        int a2 = 5;
        int b2 = 3;
        int multiplicacion = a2 * b2;  // multiplicacion será 15
        System.out.println("A2:5 * B2:3 : "+ multiplicacion);

        System.out.println("División (/): Divide el primer operando por el segundo.");
        int a3 = 10;
        int b3 = 3;
        float division = (float) a3 / b3;  // division será
        System.out.println("A3:10 / B3:3 : " + division);

        System.out.println("Módulo (%): Devuelve el residuo de la división del primer operando por el segundo.");
        int a4 = 10;
        int b4 = 3;
        int modulo = a4 % b4;  // modulo será 1
        System.out.println("A4:10 % B4:3  : " + modulo);

    }
}
