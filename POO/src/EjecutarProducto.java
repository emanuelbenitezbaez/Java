public class EjecutarProducto {
    public static void main(String[] args) {
    //Intanciamos
        Producto producto = new Producto("Coca Cola",4300,3);
        Producto producto1 = new Producto("Soda Ivess",999,2);
        Producto producto2 = new Producto("Cafe Arlistan",3400,1);
        producto.Show();
        producto1.Show();
        producto2.Show();
    }
}
