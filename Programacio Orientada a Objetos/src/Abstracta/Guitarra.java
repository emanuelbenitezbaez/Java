package Abstracta;

// Clase concreta que extiende la clase abstracta
public class Guitarra extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra...");
    }
}