package Polimorfismo;

public class Batman extends SuperHeroe{
    //Atributos
    private final String nombre;
    private final String ciudad;
    private final String trabajo;

    //Constructor
    public Batman(String alias, String raza, String nombre, String ciudad, String trabajo) {
        super(alias, raza);
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.trabajo = trabajo;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    @Override
    public String datos_heroes (){
        System.out.println("Informacion:");
        return   " Raza:  " + raza + "\n Alias: " + alias + "\n Nombre: "+ nombre + "\n Ciudad: "+ ciudad + "\n Trabajo: "+ trabajo;
    }

}
