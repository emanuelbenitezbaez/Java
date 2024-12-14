package ventas;
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(13.23, "Coca");
        Producto producto2 = new Producto(23.23, "Soda");
        Producto producto3 = new Producto(53.23, "Fernet");
        Producto producto4 = new Producto(51.23, "Speed");

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();


        Producto producto5 = new Producto(13.23, "Papel");
        Producto producto6 = new Producto(23.23, "Mayonesa");
        Producto producto7 = new Producto(53.23, "Azucar");
        Producto producto8 = new Producto(51.23, "Pan");

        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();


    }
}