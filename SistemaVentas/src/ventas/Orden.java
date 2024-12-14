package ventas;
public class Orden {
    private final int idOrden;
    private Producto[] productos;
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
        for (int i = 0; i < contadorProductos; i++) {
            total += this.productos[i].getPrecioProducto();
        } return total;
    }
    public void mostrarOrden() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Id de Orden: " + this.idOrden);

        System.out.println("Productos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("Total: " + this.calcularTotal());
    }
}