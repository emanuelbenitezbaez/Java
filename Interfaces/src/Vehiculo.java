public interface Vehiculo {
    void arrancar(); // Método abstracto
    void detener();  // Método abstracto
    default void mostrarEstado() { // Método con implementación
        System.out.println("Vehículo en estado desconocido.");
    }
}
