package persona;

public class EjecutarPersona {
    public static void main(String[] args) {
        //
        Persona persona1 = new Persona("Emanuel","Benitez Baez",35);

        persona1.obtenerDatos();

        Persona persona2 = new Persona();
        persona2.name="Paula";
        persona2.username="Federico";
        persona2.age=34;

        persona2.obtenerDatos();

    }
}
