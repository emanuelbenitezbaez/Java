public class Precedencia {
    public static void main(String[] args) {

        System.out.println("Tabla de precedencia de operadores comunes");

        System.out.println("A continuación, se presenta una tabla con la precedencia de operadores comunes en programación, de mayor a menor precedencia:");

        System.out.println("Paréntesis: Los operadores dentro de paréntesis se evalúan primero. Los paréntesis se utilizan para alterar la precedencia y forzar el orden deseado de evaluación.");

        System.out.println("Exponenciación: De existir, los operadores de exponenciación se evalúan después de los paréntesis. Este operador se utiliza para elevar un número a una potencia.");

        System.out.println("Multiplicación, división y módulo: Estos operadores tienen una precedencia superior a la de la suma y la resta. Se evalúan de izquierda a derecha, a menos que se utilicen paréntesis para alterar el orden.");

        System.out.println("Suma y resta: Estos operadores se evalúan después de la multiplicación, la división y el módulo. Al igual que los operadores anteriores, se evalúan de izquierda a derecha a menos que se utilicen paréntesis.");

        System.out.println("Operadores de comparación: Los operadores de comparación (como menor que <, mayor que >) tienen una precedencia menor que los operadores aritméticos.");

        System.out.println("Operadores de equidad: Los operadores de equidad (igual a == y distinto a !=) tienen una precedencia inferior a los de comparación.");

        System.out.println("Operador lógico AND: A continuación tendríamos los operadores lógicos. Generalmente el operador lógico ANDtiene mayor precedencia.");

        System.out.println("Operador lógico OR: Finalmente, terminamos nuestro listado genérico con el operador lógico OR, que tiene precedencia inferior a todos los anteriores.");
    }
}
