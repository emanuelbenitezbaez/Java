package Polimorfismo;

public class Superman extends SuperHeroe{

    //Atributos
    private final String nombre;
    private final String ciudad;
    private final String trabajo;
    private final String debilidad;

    //Constructor

    public Superman(String alias, String raza, String nombre, String ciudad, String trabajo, String debilidad) {
        super(alias, raza);
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.trabajo = trabajo;
        this.debilidad = debilidad;
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

    public String getDebilidad() {
        return debilidad;
    }

    @Override
    public String datos_heroes (){
        System.out.println("Informacion:");
        return   " Raza: " + raza + "\n Alias: " + alias + "\n Nombre: "+ nombre + "\n Ciudad: "+ ciudad + "\n Trabajo: "+ trabajo + "\n Debilidad: " + debilidad;
    }
}
