public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        * Enunciado: Crea una clase Persona con los atributos nombre (String), edad (int) y DNI (String).
        * Debe tener un constructor que permita inicializar estos atributos.
        * Además, implementa un método llamado mostrarInformacion() que imprima por consola los datos de la persona
        * en el siguiente formato: "Nombre: [nombre], Edad: [edad], DNI: [DNI]".
        * */
        Persona persona1 = new Persona("Juan Pérez", 30, "12345678A");
        persona1.mostrarInformacion();


    }


}

