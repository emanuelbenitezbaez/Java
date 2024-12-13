package object;

public class Persona {
   private  String name;
   private  String surname;

    public Persona(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    @Override
    public  String toString () {
        return "Nombre: " + this.name + "\nApellido: " + this.surname + "\nDireccion de memoria: " + super.toString();//Con super accedemos a la funcionalidad definida en el metodo padre.
    }


}
