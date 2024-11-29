package Abstracta;

// Clase abstracta
public abstract class Animal {
    // Método concreto
    public void comer() {
        System.out.println("El animal está comiendo...");
    }

    // Método abstracto
    public abstract void hacerSonido();
}