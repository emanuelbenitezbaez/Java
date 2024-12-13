package atributosmetodosestaticos;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Emanuel","Benitez");
        Persona persona2 = new Persona("Paula","Federico");


        System.out.println("Variable estatica: "+ Persona.numeroPersonas);





    }
}