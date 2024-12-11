package sobreescritura;

public class Main {
    public static void main(String[] args) {


        //Objeto animal 1
        Animal animal1 = new Animal();
        System.out.println("Super clase Animal:");
        animal1.comer();
        animal1.dormir();

        //Objeto perro 1 ejecuta su metodo hacer ruido y los metodos heredados de la clase padre Animal.

        Perro perro1 = new Perro();
        System.out.println();
        System.out.println("Subclase Perro:");
        perro1.hacerRuido();
        perro1.comer();
        perro1.dormir();


    }
}