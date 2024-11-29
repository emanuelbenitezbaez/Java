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

        Animal leon = new Leon();
        Animal elefante = new Elefante();

        //Accedemos al metodo abastracto de la clase padre hacerSonido() desde sus clases hijas.
        leon.hacerSonido();
        //Comer es un metodo concreto
        leon.comer();

        //Accedemos al metodo abastracto de la clase padre hacerSonido() desde sus clases hijas.
        elefante.hacerSonido();
        //Comer es un metodo concreto.
        elefante.comer();


    }
}
