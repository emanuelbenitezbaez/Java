public class EjercicioNot {
    public static void main(String[] args) {

        boolean estaLloviendo = false;

        if (estaLloviendo) {
            System.out.println("Deberías llevar un paraguas.");
        } else {
            System.out.println("No necesitas llevar un paraguas.");
        }
        System.out.println("/////////////////////////////////");


        if (!estaLloviendo) {
            System.out.println("Deberías llevar un paraguas.");
        } else {
            System.out.println("No necesitas llevar un paraguas.");
        }
    }
}
