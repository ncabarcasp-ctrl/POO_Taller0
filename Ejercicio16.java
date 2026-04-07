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
}
