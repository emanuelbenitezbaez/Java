public class Main {

    String color;
    String modelo;
    int  recorrido;
    int precio;



    public static void main(String[] args) {

        // Programación Orientada a Objetos.
        // Es un paradigma de programación que se basa en la idea de modelar el mundo real en términos de objetos.
        // Estos objetos tienen atributos (características) y métodos (acciones) que definen su comportamiento.
    //Creamos un objeto
        Main coche = new Main();

        coche.color ="Blanco";
        coche.modelo = "Chevrolet";
        coche.recorrido = 100000;
        coche.precio = 8000;

        System.out.println("Color coche 1: " + coche.color);
        System.out.println("Precio coche 1: " + coche.precio);
        System.out.println("Recorrido coche 1: " + coche.recorrido);

        System.out.println("-------------------------------------------");
        Main coche2 = new Main();

        coche2.color ="Negro";
        coche2.modelo = "Ford";
        coche2.recorrido = 90000;
        coche2.precio = 7000;

        System.out.println("Color coche 2: " + coche2.color);
        System.out.println("Precio coche 2: " + coche2.precio);
        System.out.println("Recorrido coche 2: " + coche2.recorrido);

    }
}