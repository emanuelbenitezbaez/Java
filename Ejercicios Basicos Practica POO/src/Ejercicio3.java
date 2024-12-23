public class Ejercicio3 {
    public static void main(String[] args) {
        /*Enunciado: Define una clase Punto con atributos x (int) e y (int).
        Luego, crea una clase Círculo que tenga un atributo centro de tipo Punto y un atributo radio (double).
         Implementa un constructor para Círculo y los métodos calcularArea() y calcularPerimetro().*/

        // Crear un objeto Punto para el centro del círculo
        Punto centro = new Punto(0, 0); // El centro del círculo es el punto (0, 0)

        // Crear un objeto Circulo con el centro y un radio de 5
        Circulo circulo = new Circulo(centro, 5.0);

        // Calcular y mostrar el área del círculo
        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);

        // Calcular y mostrar el perímetro del círculo
        double perimetro = circulo.calcularPerimetro();
        System.out.println("Perímetro del círculo: " + perimetro);
    }
}
