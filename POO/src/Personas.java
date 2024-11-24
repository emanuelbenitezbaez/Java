public class Personas {


    private String nombre;
    private String apellido;
    private int edad;

    // Constructor sin parámetros (crea una persona sin datos)
    public  Personas() {
    }

    // Constructor con nombre y apellido
    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor con todos los parámetros
    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Edad: " + edad);

    }


}
