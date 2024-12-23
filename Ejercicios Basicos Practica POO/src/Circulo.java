public class Circulo  {
    Punto centro;
    double radio;
    double PI = 3.14;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    //Metodos

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio; // Área = π * radio²
    }

    // Método para calcular el perímetro (circunferencia) del círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Perímetro = 2 * π * radio
    }
}
