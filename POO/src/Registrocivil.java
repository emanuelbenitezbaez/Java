public class Registrocivil {
    public static void main(String[] args) {

        //Creacion de objetos y llamada a metodos:
        Persona persona = new Persona();

        persona.dni="235235987";
        persona.edad= 34;
        persona.nombre="Emanuel";


        System.out.println("Nombre:" + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("DNI: " + persona.dni);

    }
}
