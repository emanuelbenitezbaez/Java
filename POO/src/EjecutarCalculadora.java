public class EjecutarCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // Ejemplos de uso
        int resultadoSuma = calculadora.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = calculadora.restar(10, 4);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = calculadora.multiplicar(2, 6);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        int resultadoDivision = calculadora.dividir(15,2);
        System.out.println("División: " + resultadoDivision);

        // División por cero
        int resultadoDivisionCero = calculadora.dividir(10, 0);
        System.out.println("División por cero: " + resultadoDivisionCero);

    }
}
