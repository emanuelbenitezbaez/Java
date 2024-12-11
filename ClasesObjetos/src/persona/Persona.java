package persona;

public class Persona {
    //Atributos

   private String name;
   private String username;
   private int age;


    //Constructor

    public Persona() {
    }

    public Persona(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

    //Metodos

    public void obtenerDatos () {
        System.out.println("Nombre: " + name);
        System.out.println("Apellido; " + username);
        System.out.println("Edad: " + age);
    }

    //Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
