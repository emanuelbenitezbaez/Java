public class Coche implements Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }
}
