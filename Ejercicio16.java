class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarProducto() {
        System.out.println("Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
    void vender (int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Venta rechazada. Stock insuficiente de " + nombre + ". Stock actual: " + stock + " unidades.");
        }
    }

void reabastecer (int cantidad) {
    if (cantidad > 0) {
        stock += cantidad;
    } else {
        System.out.println("ERROR: La cantidad a reabastecer debe ser mayor que cero.");
    }
}

}
public class Ejercicio16 {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "Tablet";
        producto1.precio = 299.99;
        producto1.stock = 5;
        System.out.println("INVENTARIO INICIAL:");
        producto1.mostrarProducto();
        System.out.println("\nLlego el camion: Resabasteciendo 15 tablets...");
        producto1.reabastecer(15);
        producto1.mostrarProducto();
        System.out.println("\nIntentando reabastecer -5 tablets...");
        producto1.reabastecer(-5);
        producto1.mostrarProducto();
    }
}
