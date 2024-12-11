package aritmetica;

import persona.Persona;

public class Main {
    public static void main(String[] args) {

    Aritmetica operando1 =new Aritmetica(10,10);
    operando1.sumar();

    Aritmetica operando2 = new Aritmetica(20,10);
    operando2.restar();


        Persona persona = new Persona("name","surname",13);
        persona.obtenerDatos();



    }
}