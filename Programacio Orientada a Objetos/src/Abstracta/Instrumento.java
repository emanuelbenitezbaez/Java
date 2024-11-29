package Abstracta;

// Clase abstracta
public abstract class Instrumento {
    // Método concreto
    public void afinar() {
        System.out.println("Afinando el instrumento...");
    }

    // Método abstracto
    public abstract void tocar();

}

