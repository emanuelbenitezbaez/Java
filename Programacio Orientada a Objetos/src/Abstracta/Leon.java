package Abstracta;

// Clase concreta que extiende la clase abstracta
public class Leon extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El león ruge...");
    }
}