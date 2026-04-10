class Comic {
    String titulo;
    String editorial;
    double precio;
    int stock;

    public Comic(String titulo, String editorial, double precio, int stock) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.precio = precio;
        this.stock = stock;
    }

    void venderComic() {
        if (stock > 0) {
            stock--;
            System.out.println("💥 ¡Pow! Cómic '" + titulo + "' vendido. Ingreso de $" + precio + " a caja. Stock restante: " + stock);
        } else {
            System.out.println("❌ ¡Crash! Venta rechazada. El cómic '" + titulo + "' está agotado.");
        }
    }

    void mostrarInfo() {
        System.out.println("--- FICHA DEL CÓMIC ---");
        System.out.println("Título: " + titulo);
        System.out.println("Editorial: " + editorial);
        System.out.println("Precio: $" + precio);
        System.out.println("Unidades disponibles: " + stock);
        System.out.println();
    }
}

public class Ejercicio69 {
    public static void main(String[] args) {
        // 1. Instanciamos los 5 objetos usando el MISMO molde
        Comic comicBatman = new Comic("Batman: The Killing Joke", "DC Comics", 15.50, 2);
        Comic comicSpiderMan = new Comic("Spider-Man: Kraven's Last Hunt", "Marvel Comics", 12.00, 0);
        Comic comicSnoopy = new Comic("Snoopy: Peanuts Classics", "Fantagraphics", 12.99, 5);
        Comic comicGarfield = new Comic("Garfield: Fat Cat Three-Pack", "Ballantine Books", 18.00, 3);
        Comic comicSpyFamily = new Comic("Spy x Family Vol. 1", "Viz Media", 9.99, 10);
        
        // Mostramos los 5 objetos
        comicBatman.mostrarInfo();
        comicSpiderMan.mostrarInfo();
        comicSnoopy.mostrarInfo();
        comicGarfield.mostrarInfo();
        comicSpyFamily.mostrarInfo();
        
        // Simulamos un par de ventas
        comicSnoopy.venderComic();
        comicSpyFamily.venderComic(); 
        
        // Verificamos cómo quedó el inventario de Spy x Family tras la venta
        comicSpyFamily.mostrarInfo();
        comicSnoopy.mostrarInfo();
    }
}