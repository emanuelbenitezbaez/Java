package Abstracta;

// Clase concreta que extiende la clase abstracta
public class Coche extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche...");
    }
}