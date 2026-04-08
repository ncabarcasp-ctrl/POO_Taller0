class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public static Producto crearProductoBasico(String nombre) {
        return new Producto(nombre, 9.99,10);
    }
    void vender(int cantidad) {
        stock = stock - cantidad;
}
void restablecer(int cantidad) {
    stock = stock + cantidad;
}

void mostrarProducto() {
    System.out.println("Nombre: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
}
}
public class Ejercicio31 {
    public static void main(String[] args) {
    }
}