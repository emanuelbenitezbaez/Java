public class Main {
    public static void main(String[] args) {

        //CONDICIONAL ANIDADO

        int edad = 35; // Puedes cambiar este valor para probar

        if (edad >= 18) {
            //System.out.println("Eres mayor de edad.");
            if (edad >= 65) {
                System.out.println("Eres una persona de la tercera edad.");
            } else if (edad >= 30) {
                System.out.println("Eres un adulto joven.");
            } else {
                System.out.println("Eres un adulto.");
            }
        } else if (edad >= 13) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 2) {
            System.out.println("Eres un niño/a.");
        } else {
            System.out.println("Eres un bebé.");
        }

    }
}