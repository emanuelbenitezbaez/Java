package Polimorfismo;

public class SuperHeroe {
    //Atributos
    protected String alias;
    protected String raza;

    //Constructor
    public SuperHeroe(String alias, String raza) {
        this.alias = alias;
        this.raza = raza;
    }


    //Getters
    public String getAlias() {
        return alias;
    }

    public String getRaza() {
        return raza;
    }

    public String datos_heroes (){
        System.out.println("Informacion:");
        return   " Raza:  " + raza + "\n Alias: " + alias;
    }


}
