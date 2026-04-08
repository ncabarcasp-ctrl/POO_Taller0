class producto {
    String nombre;
    double precio;
    int stock;

    public producto() {
    }

    public producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    void vender(int cantidad) { 
        stock = stock - cantidad;
    }

    void reabastecer(int cantidad){
        stock = stock + cantidad;
    }

    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

public class Ejercicio26 {
    public static void main(String[] args) {
        producto p1 = new producto();
        p1.nombre = "Tablet";
        p1.precio = 299.99;
        p1.stock = 50;

        producto p2 = new producto("Smartphone", 499.99, 30);

        p1.mostrarProducto();
        p2.mostrarProducto();
        p1.vender(5);
        p2.reabastecer(2);

        System.out.println("\nDespués de vender 5 unidades de Tablet y reabastecer 2 unidades de Smartphone:");
        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}