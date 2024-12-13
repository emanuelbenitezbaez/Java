package atributosestaticos;


public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Emanuel","Benitez");
        Persona persona2 = new Persona("Paula","Federico");
        Persona persona3 = new Persona("Nombre","Apellido");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println("\nCantidad total de objetos persona creados: " +Persona.numeroPersonas);






    }
}