package Encapsulamiento;

public class EjecutarPersona {
    public static void main(String[] args) {

      Persona persona = new Persona("Emanuel",35);

      
        // Acceder y modificar los atributos usando los métodos públicos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificar los valores usando los setters
        persona.setNombre("María"); persona.setEdad(25);

        // Mostrar los nuevos valores
        System.out.println("Nuevo Nombre: " + persona.getNombre());
        System.out.println("Nueva Edad: " + persona.getEdad());
    }
}
