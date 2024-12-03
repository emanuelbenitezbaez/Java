package SobrecargaSobreescritura;

public class EjecutarSobrecargaSobreescritura {
    //La sobrecarga de métodos se refiere a la capacidad de definir múltiples métodos con el mismo nombre en una misma clase,
    // pero con diferentes parámetros (tipos, cantidad, o ambos).
    // Esto permite que un mismo método pueda realizar diferentes tareas según los argumentos que reciba.


    //La sobrescritura de métodos, por otro lado, se refiere a redefinir un método en una subclase que ya está definido en su superclase.
    // Esto permite a la subclase proporcionar una implementación específica del método que reemplaza a la de la superclase.

    public static void main(String[] args) {

        Trabajar empleado = new Trabajar();
        Empleado empleado1 =  new Empleado();
        OtroEmpleado empleado2 = new OtroEmpleado();

        empleado1.trabajo();
        empleado2.trabajo();
        empleado.trabajo();
    }
}
