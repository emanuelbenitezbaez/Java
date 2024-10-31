public class Main {
    public static void main(String[] args) {




       // Ejercicio #1.

        /*
        Declara cinco variables de tipo int y realiza las siguientes operaciones: (a + b) * (c - d) / e y a + (b * (c / (d - e))).
                Imprime los resultados en la consola.
*/
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        float resultado1= (float) ((a + b) * (c - d)) / e ;
        float resultado2 = a + (b * ((float) c /(d-e)));
        System.out.println(resultado1);
        System.out.println(resultado2);
                // Ejercicio #2.
/*
        Declara dos variables de tipo double que representen la base y la altura de un rectángulo.
                Calcula el área del rectángulo utilizando la fórmula base * altura y el perímetro utilizando la fórmula 2 * (base + altura).
                Imprime los resultados en la consola.
 */
        double base = 10;
        double altura = 2;
        double area_rec = base * altura;
        double perimetro = 2 *(base + altura);
        System.out.println("El area del rectangulo es :"+ area_rec);
        System.out.println("El perimetro del rectangulo es : " + perimetro);

    }
}