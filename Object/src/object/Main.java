package object;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Nombre","Apellido");
        Persona persona2 = new Persona("Nombre1","Apellido2");

        System.out.println(persona1);//Se llama el metodo toString de forma automatica.
        System.out.println(persona2);


    }
}