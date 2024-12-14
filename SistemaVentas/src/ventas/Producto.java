package ventas;
public class Producto {
    private static int cantidadProducto = 0;
    private final int idProducto;
    private String nombreProducto;
    private double precioProducto;


    public Producto(double precioProducto, String nombreProducto) {
        this.precioProducto = precioProducto;
        this.nombreProducto = nombreProducto;
        this.idProducto = ++Producto.cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    @Override
    public String toString() {
        return  "id: " + idProducto + ", nombre: " + nombreProducto  + ", precio: " + precioProducto;
    }
}