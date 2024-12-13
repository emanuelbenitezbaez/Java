package metodosestaticos;

public class Persona {


    //Estatico es cuando una variable que se asocia con una clase en si misma y no con sus objetos
    private static int numeroPersonas= 0;
    private String name;
    private String username;
    private int idPersonas ;


    public Persona(String name, String username) {
        this.name = name;
        this.username = username;
        Persona.numeroPersonas++;
        this.idPersonas = Persona.numeroPersonas;

    }

    @Override
    public String toString () {
        return  "\nName: "+ this.name + "\nUsername: " + this.username + "\nId: " + idPersonas ;
    }



    public static int getNumeroPersonas() {
        return Persona.numeroPersonas;
    }

}
