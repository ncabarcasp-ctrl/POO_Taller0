// Para este ejercicio he elegido el ejercicio 8 del bloque B porque, al tener
// tres objetos, el código original requería 9 lineas solo para asignar
// valores (nombre, precio y stock de cada uno). Al refactorizar con un
// contructor con parámetros, se ve evidencia cómo el código se vuelve mas
// limpio, legible y optimizado, reduciendo esas 9 lineas a solo 3 lineas de creación de objetos.

class Producto {
    String nombre;
    double precio;
    int stock;

    // El constructor con parámetros
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("--------------------"); // Un separador visual para que se vea más lindo
    }
}

public class Ejercicio71 { 
    public static void main(String[] args) {
        // El código se redujo y se volvió más legible
        // Pasó de 12 líneas de instanciación y asignación, a solo 3.
        
        Producto producto1 = new Producto("Laptop", 999.99, 10);
        Producto producto2 = new Producto("Smartphone", 499.99, 20);
        Producto producto3 = new Producto("Tablet", 299.99, 15);

        System.out.println("--- INVENTARIO DE PRODUCTOS ---");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
    } 
}
