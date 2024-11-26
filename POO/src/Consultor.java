public class Consultor extends Usuario{

    String nombre_consultora;
    int numero_consultor;

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_consultora, int numero_consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.numero_consultor = numero_consultor;
    }

    public void mostrarDetallesDeConsultor () {
        System.out.println("Informacion del consultor:");
        System.out.println("Id: " +id);
        System.out.println("DNI: "+dni);
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+apellido);
        System.out.println("Domicilio:"+domicilio);
        System.out.println("Telefono:"+telefono);
        System.out.println("Numero de consultor:"+numero_consultor);
        System.out.println("Numero de consultor:"+numero_consultor);
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNumero_consultor() {
        return numero_consultor;
    }

    public void setNumero_consultor(int numero_consultor) {
        this.numero_consultor = numero_consultor;
    }
}
