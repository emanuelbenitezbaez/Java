public class Asignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de Asignación");
        System.out.println("Estos operadores se utilizan para asignar valores a variables.");

        System.out.println("Asignación básica (=): Asigna el valor del operando de la derecha al operando de la izquierda.");
        int a = 5;
        System.out.println("Asignacion basica int a = 5 : " + a );

        System.out.println("Asignación compuesta (+=, -=, *=, /=, %=): Realiza la operación indicada y luego asigna el resultado a la variable de la izquierda.");
        int a1 = 10;
        System.out.println("a1: 10 : " + a1);
        a1 += 5;  // equivalente a: a = a + 5;

        System.out.println("Asignacion compuesta: a1 += 5 : equivalente a: a = a + 5 : " + a1);
    }
}
