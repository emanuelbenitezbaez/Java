public class Motocicleta extends Vehiculo{

    private String tipoCasco;

    public Motocicleta(String marca, String modelo, int anio, String tipoCasco) {
        super(marca, modelo, anio);
        this.tipoCasco = tipoCasco;
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de casco recomendado: " + tipoCasco);
    }
}
