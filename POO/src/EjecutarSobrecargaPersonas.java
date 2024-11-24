public class EjecutarSobrecargaPersonas {


    public static void main(String[] args) {

        // Crear una persona sin datos
        Personas persona1 = new Personas();

        // Crear una persona con nombre y apellido
        Personas persona2 = new Personas("Juan","Perez");

        // Crear una persona con todos los datos
        Personas persona3 = new Personas("Juan","Perez",45);

        // Mostrar los datos de las personas
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

    }



}
