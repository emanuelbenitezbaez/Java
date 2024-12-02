package MetodoEstatico;

public class EjecutarMatematica {
    public static void main(String[] args) {


        /*
        *  Un método estático en Java es un método que pertenece a la clase en sí, y no a las instancias de la clase.
        *  Esto significa que puedes llamar a un método estático sin crear un objeto de la clase.
        *  Los métodos estáticos se declaran utilizando la palabra clave static
        * */

        // Llamar al método estático sin crear una instancia de Matematica
        int resultado = Matematica.sumar(5, 3);
        System.out.println("Resultado: " + resultado); // Imprime: Resultado: 8
    }
}
