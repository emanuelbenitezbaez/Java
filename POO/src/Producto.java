public class Producto {

    //Ejercicio de codificación Método constructor
    //Crea una clase Producto que tenga las siguientes propiedades:
    //Nombre (String).
    //Precio (double) .
    //Cantidad (int).
    //Implementa un constructor que reciba como parámetros los valores para estas propiedades y los inicialice.
    // Luego, en una clase Inventario, crea al menos dos objetos Producto utilizando el constructor y muestra la información de cada producto en la consola.

    //Atributos
    String nombre;
    double precio;
    int cantidad;
    String descripcion;

    //Constructor
    public Producto (String nombre,double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Sobrecarga de metodo
    public Producto (String nombre,double precio, int cantidad,String descripcion){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public void Show() {
        System.out.println("Datos: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descripcion: " + descripcion);
    }

}
