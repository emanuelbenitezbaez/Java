public class Colaborador extends  Usuario{


    int num_legajo;
    String cargo;
    double sueldo;


    public Colaborador(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int num_legajo, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void mostrarDetalles () {
        System.out.println("Informacion del empleado:");
        System.out.println("Id: " +id);
        System.out.println("DNI: "+dni);
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Domicilio:"+domicilio);
        System.out.println("Telefono:"+telefono);
        System.out.println("Numero de legajo:"+num_legajo);
        System.out.println("Cargo:"+cargo);
        System.out.println("Sueldo:"+sueldo);

    }
}
