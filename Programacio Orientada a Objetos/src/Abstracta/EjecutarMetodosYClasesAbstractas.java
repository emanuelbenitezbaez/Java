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
    }







}
