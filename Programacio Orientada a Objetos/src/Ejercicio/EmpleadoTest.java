package Ejercicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoTest   {

    @Test
public void calcularSalarioEmpleadoPorHora() {
    Empleado empleadoPorHora = new EmpleadoPorHora(15.0, 160);
    assertEquals(2400.0, empleadoPorHora.calcularSalario());
}


    @Test
public void calcularSalarioEmpleadoFijo() {
    Empleado empleadoFijo = new EmpleadoFijo(3000.0);
    assertEquals(3000.0, empleadoFijo.calcularSalario());
}
}
