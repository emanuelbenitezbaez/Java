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

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
