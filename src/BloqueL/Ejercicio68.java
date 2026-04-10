//Diseño de la Clase: Comic
// 1. Atributos (Estado)
// titulo (`String`): El nombre del cómic o novela gráfica.
// editorial (`String`): La casa publicadora (Marvel, DC, Image, etc.).
// precio (`double`): El valor de venta al público.
// stock (`int`): La cantidad de ejemplares físicos disponibles en la tienda.

// 2. Métodos (Comportamiento)
// venderComic(): Verifica si hay `stock` mayor a cero. Si es así, resta 1 al inventario y registra la venta. Si no, muestra una alerta de producto agotado.
// mostrarInfo(): Imprime la ficha técnica y comercial del cómic.

// 3. Objetos Reales (Instancias)
// Objeto 1: Título: "Batman: The Killing Joke"
  // Editorial: "DC Comics"
  // Precio: 15.50
  // Stock: 2

// Objeto 2:  Título: "Spider-Man: Kraven's Last Hunt"
  // Editorial: "Marvel Comics"
// Precio: 12.00
// Stock: 0

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
    }
}

public class Ejercicio68 {
    public static void main(String[] args) {

    }
}