public class CicloFor {
    public static void main(String[] args) {
        //CICLO FOR
/*
El ciclo for es una estructura de control en Java que
nos permite ejecutar un bloque de código un número determinado de veces.

for (inicialización; condición; incremento) {
    // Código a ejecutar en cada iteración
}

 */
        var valor_maximo = 10;

        for (int i = 1; i <= valor_maximo; i++) {
            System.out.println("El valor del indice " + i + " es: " + i);
        }
    }
}
