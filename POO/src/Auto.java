public class Auto extends  Vehiculo{


    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    public void show (){
        System.out.println("---------- DETALLES DEL VEHICULO ----------");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo : " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Numero de puertas:" + numPuertas);
    }
}
