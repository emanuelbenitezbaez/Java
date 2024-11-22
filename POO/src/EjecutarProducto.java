public class EjecutarProducto {
    public static void main(String[] args) {
    //Intanciamos
        Producto producto = new Producto("Coca Cola",4300,3);
        Producto producto1 = new Producto("Soda Ivess",999,2);
        Producto producto2 = new Producto("Cafe Arlistan",3400,1);

        //Instancia de un metodo con sobrecarga
        Producto producto3 = new Producto("Sopapa",4600,1,"Producto de limpieza");

        producto.Show();
        producto1.Show();
        producto2.Show();
        producto3.ShowPlus();

    }
}
