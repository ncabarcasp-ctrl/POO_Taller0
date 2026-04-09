class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    void mostrarDetalle() {
        System.out.println("--- DETALLE DE INVENTARIO ---");
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad en stock: " + cantidad + " unidades");
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Valor Total Almacenado: $" + calcularValorTotal());
    }
}

public class Ejercicio58 {
    public static void main(String[] args) {
        InventarioItem miItem = new InventarioItem("Teclado Mecánico", 50, 45.50);
        
        miItem.mostrarDetalle();
    }
}