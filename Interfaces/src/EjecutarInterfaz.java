public class EjecutarInterfaz {

    public static void main(String[] args) {

        /*
        * En Java, una interface es un tipo de referencia que se utiliza para definir un conjunto de métodos abstractos (sin implementación).
        * Es una forma de establecer un contrato que las clases que implementen esa interfaz deben cumplir.
        *  Las interfaces son fundamentales para lograr la programación orientada a interfaces, un principio clave en el diseño orientado a objetos.

Características principales de una interfaz en Java:
Definición de métodos abstractos:

Todos los métodos en una interfaz son, por defecto, public y abstract (incluso si no se especifican explícitamente).
Desde Java 8, las interfaces pueden incluir métodos con implementación mediante default y métodos estáticos (static).
Constantes:

Las interfaces pueden contener variables, pero estas son siempre public static final, es decir, constantes.
Herencia múltiple:

Una clase puede implementar múltiples interfaces, lo que permite heredar comportamientos de varias fuentes, resolviendo la limitación de la herencia simple en Java.
No instanciables:

No se pueden crear instancias de una interfaz. Solo pueden ser implementadas por una clase o extendidas por otra interfaz.
¿Por qué usar interfaces?
Polimorfismo: Permite que una clase pueda ser tratada como cualquier tipo que implemente.
Abstracción: Define qué hace una clase sin preocuparse por cómo lo hace.
Flexibilidad: Facilita la creación de sistemas desacoplados, donde los componentes están conectados mediante contratos (interfaces) en lugar de implementaciones concretas.
        * */
        Vehiculo miCoche = new Coche();
        miCoche.arrancar();
        miCoche.mostrarEstado();
        miCoche.detener();
    }
}
