package persona;

public class Persona {
    //Atributos

    String name;
    String username;
    int age;


    //Constructor

    public Persona() {
    }

    public Persona(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

    //Metodos

    void obtenerDatos () {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido; " + username);
        System.out.println("Edad: " + age);
    }

}
