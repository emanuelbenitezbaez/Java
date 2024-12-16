package ventas;
public class Orden {
    private final int idOrden;
    private final Producto[] productos;
    private int contadorProductos;
    private static int contadorOrdenes = 0;
    private static final int maxProduct = 4;


    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.maxProduct];

    }
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos >= maxProduct) {
            System.out.println("Error, límite alcanzado.");
        } else {
            this.productos[this.contadorProductos++] = producto;
        }
    }
    public double calcularTotal() {
        double total = 0;


        for (Producto producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecioProducto();
            }
        }
        return total;
    }
    public void mostrarOrden() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Id de Orden: " + this.idOrden);
        System.out.println("Productos: ");


        for (Producto producto : this.productos) {
            System.out.println(producto);
        }
        System.out.println("Total: " + this.calcularTotal());
    }
}