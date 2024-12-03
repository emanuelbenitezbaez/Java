package SobrecargaSobreescritura;

public class OtroEmpleado extends Trabajar{

    @Override
    public void trabajo() {
        System.out.println("Yo tengo otro puesto...");
    }
}
