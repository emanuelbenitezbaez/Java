public class Vehiculo {

    //Ejercicio de codificación Herencia
    //Crea una clase base llamada Vehiculo que tenga las propiedades marca, modelo y año.
    //Luego, crea dos clases derivadas, Auto y Motocicleta, que hereden de Vehiculo.
    // En la clase Auto, agrega una propiedad adicional llamada numPuertas, y en la clase Motocicleta, agrega una propiedad llamada tipoCasco.
    //Crea un método en la clase Vehiculo que muestre todos los detalles del vehículo, y sobrescribe este método en las clases derivadas para incluir las propiedades adicionales.
    // En una clase PruebaVehiculos, crea instancias de Auto y Motocicleta, asigna valores a sus propiedades, y muestra los detalles de cada uno en la consola.


    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarDetalles (){
        System.out.println("---------- DETALLES DEL VEHICULO ----------");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo : " + getModelo());
        System.out.println("Año: " + getAnio());
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }


}

