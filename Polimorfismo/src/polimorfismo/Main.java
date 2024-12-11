package polimorfismo;

public class Main {
    public static void main(String[] args) {


        Animales animal1 = new Animales();
        animal1.hacerRuido();

        //Dependiendo del objeto al que apuntemos , llama a su metodo.
        Animales perro = new Perro();
        perro.hacerRuido();

        Animales gato = new Gato();
        gato.hacerRuido();

    }
}