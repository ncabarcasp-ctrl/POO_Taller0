class Producto {
    String nombre;
    double precio;
    int stock;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}

public class Ejercicio8 { 
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.nombre = "Laptop";
        producto1.precio = 999.99;
        producto1.stock = 10;

        producto2.nombre = "Smartphone";
        producto2.precio = 499.99;
        producto2.stock = 20;

        producto3.nombre = "Tablet";
        producto3.precio = 299.99;
        producto3.stock = 15;

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
    } 
}