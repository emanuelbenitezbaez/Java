public class Empleado {

    //Ejercicio de codificación Sobrecargando Metodos
    //Crea una clase Empleado que tenga las siguientes propiedades:
    //Nombre (String).
    //Salario (double).
    //Departamento (String).
    //Implementa dos constructores en la clase: Un constructor que reciba todos los atributos (Nombre, Salario, Departamento) como parámetros.
    //Un constructor que solo reciba Nombre y Salario, y asigne un valor predeterminado al Departamento.
    // En una clase Empresa, crea objetos Empleado utilizando ambos constructores y muestra la información de cada empleado en la consola.

    //ATRIBUTOS
    private String nombre;
    private double salario;
    private String departamento;


    //METODOS


    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void show () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);

    }
}
