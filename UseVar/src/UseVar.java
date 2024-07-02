public class UseVar {
    public static void main(String[] args) {
        /*
        Su propósito es permitir que el compilador infiera automáticamente el tipo de una variable
        local basándose en el tipo de inicialización de la expresión a la que se asigna.
        */
        var numero = 10;  // Se infiere que 'numero' es de tipo int
        var nombre = "Juan";  // Se infiere que 'nombre' es de tipo String

    }
}
