public class Motocicleta extends Vehiculo{

    private String tipoCasco;

    public Motocicleta(String marca, String modelo, int anio, String tipoCasco) {
        super(marca, modelo, anio);
        this.tipoCasco = tipoCasco;
    }

    public void show (){
        System.out.println("---------- DETALLES DEL VEHICULO ----------");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo : " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Tipo de casco:" + tipoCasco);
    }
}
