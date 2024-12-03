package SobrecargaSobreescritura;

public class Empleado extends Trabajar {

    @Override
    public void trabajo() {
        System.out.println("Yo trabajaria como..");
    }

}
