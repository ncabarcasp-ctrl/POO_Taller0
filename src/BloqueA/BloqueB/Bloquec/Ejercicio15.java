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
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        
        producto1.nombre = "Laptop";
        producto1.precio = 999.99;
        producto1.stock = 10;

        producto2.nombre = "Smartphone";
        producto2.precio = 499.99;
        producto2.stock = 20;

        System.out.println("IVENTARIO INICIAL:");
        producto1.mostrarProducto();
        producto2.mostrarProducto();

        System.out.println("\nVENDIENDO 3 Laptops...");
        producto1.vender(3);

        System.out.println("\nINTENTANDO VENDER 25 Smartphones...");
        producto2.vender(25);
        System.out.println("\nINVENTARIO FINAL:");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }
}
