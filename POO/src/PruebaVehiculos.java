public class PruebaVehiculos {
    public static void main(String[] args) {


    Auto auto = new Auto("Toyota", "Corolla", 2023, 4);
    auto.mostrarDetalles();

    Motocicleta motocicleta = new Motocicleta("Honda", "CBR600RR", 2022, "Integral");
    motocicleta.mostrarDetalles();
    }
}
