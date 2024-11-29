package Abstracta;

// Clase abstracta
public abstract class Vehiculo {
    // Método concreto
    public void encender() {
        System.out.println("Encendiendo el vehículo...");
    }

    // Método abstracto
    public abstract void conducir();
}