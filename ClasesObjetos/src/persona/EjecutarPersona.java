package persona;

public class EjecutarPersona {
    public static void main(String[] args) {
        //
        Persona persona1 = new Persona("Emanuel","Benitez Baez",35);

        persona1.obtenerDatos();

        Persona persona2 = new Persona();
        persona2.setName("Paula");
        persona2.setUsername("Federico");
        persona2.setAge(34);

        persona2.obtenerDatos();

    }
}
