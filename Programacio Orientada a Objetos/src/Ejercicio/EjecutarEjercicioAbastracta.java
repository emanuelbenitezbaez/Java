package Ejercicio;

public class EjecutarEjercicioAbastracta {
    public static void main(String[] args) {
        /*
        * Ejercicio de codificación Clases abstractas
Crea una jerarquía de clases para modelar diferentes tipos de empleados en una empresa.
Clase abstracta Empleado:
Define una clase abstracta llamada Empleado.
Contiene un método abstracto llamado calcularSalario(), que todas las subclases deben implementar.
Clase EmpleadoPorHora:
Extiende de la clase Empleado.
Contiene los atributos:
tarifaPorHora (de tipo double): La tarifa que se paga al empleado por hora trabajada.
horasTrabajadas (de tipo int): Número de horas trabajadas.
Implementa el método calcularSalario() para devolver el producto de la tarifa por hora y las horas trabajadas.
Clase EmpleadoFijo:
Extiende de la clase Empleado.
Contiene el atributo:
salarioMensual (de tipo double): El salario fijo mensual del empleado.
Implementa el método calcularSalario() para devolver el valor del salario mensual.
Requisitos
Implementa las clases siguiendo las instrucciones.
Crea un programa principal para probar las clases y métodos.
Implementa pruebas unitarias usando JUnit 5 para validar el funcionamiento de los métodos calcularSalario().
        * */

    Empleado empleadoPorHora = new EmpleadoPorHora(11000,8);

    System.out.println("Sueldo del empleado por hora: " + empleadoPorHora.calcularSalario());

    Empleado empleadoFijo = new EmpleadoFijo(2640000);

    System.out.println("Sueldo del empleado fijo:" + empleadoFijo.calcularSalario());

    }
}
