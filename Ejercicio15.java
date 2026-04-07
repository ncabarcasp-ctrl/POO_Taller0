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
}

public class Ejercicio15 {
}
