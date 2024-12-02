package Encapsulamiento;

public class Persona {


    /*
     * En Java, el encapsulamiento se refiere a la práctica de restringir el acceso directo a algunos de los componentes de un objeto.
     * Esto se logra utilizando modificadores de acceso, como private, protected, y public, para controlar la visibilidad de los datos y métodos dentro de una clase.
     */

    // Atributos privados
    private String nombre;
    private int edad;
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre; this.edad = edad; }

    // Métodos públicos para acceder y modificar los atributos privados


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
