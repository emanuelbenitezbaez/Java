package Abstracta;

public class EjecutarMetodosYClasesAbstractas {


    public static void main(String[] args) {

        Instrumento guitarra = new Guitarra();
        Instrumento piano = new Piano();

        guitarra.afinar();
        piano.tocar();

        Vehiculo moto = new Moto();
        Vehiculo coche = new Coche();

        moto.conducir();
        coche.encender();

        Animal animal = new Leon();
        animal.comer();

        Animal animal1 = new Elefante();
        animal1.comer();

        Animal leon = new Leon();
        Animal elefante = new Elefante();

        leon.hacerSonido();
        elefante.hacerSonido();

    }
}
