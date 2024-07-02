public class UseVar {
    public static void main(String[] args) {
        /*
        Su propósito es permitir que el compilador infiera automáticamente el tipo de una variable
        local basándose en el tipo de inicialización de la expresión a la que se asigna.
        */
        var numero = 10;  // Se infiere que 'numero' es de tipo int
        var nombre = "Juan";  // Se infiere que 'nombre' es de tipo String
        var edad = 30;

        System.out.println(numero);
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad);

        numero = 15;
        nombre = "Carlos";
        edad = 27;

        System.out.println("Numero modificado: " + numero);
        System.out.println("Nombre modificado: " + nombre);
        System.out.println("Edad modificada: " + edad);
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad);


    }
}
