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
    } 
}