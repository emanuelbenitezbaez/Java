package atributosmetodosestaticos;

public class Persona {

    static int numeroPersonas= 0;
    static String name;
    static String username;


    public Persona(String name, String username) {
        this.name = name;
        this.username = username;
        Persona.numeroPersonas++;

    }

    @Override
    public String toString () {
        return  "\nName: "+ name + "\nUsername: " + username + "\nPerson: " + Persona.numeroPersonas;
    }


}
