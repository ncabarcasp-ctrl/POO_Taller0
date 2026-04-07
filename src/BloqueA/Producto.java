public class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}
