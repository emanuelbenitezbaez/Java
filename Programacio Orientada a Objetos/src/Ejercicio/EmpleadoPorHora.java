package Ejercicio;

public class EmpleadoPorHora extends Empleado {

    double tarifaPorHora;
    int horasTrabajadas;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(double tarifaPorHora, int horasTrabajadas) {
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
         return tarifaPorHora * horasTrabajadas;
    }
}
