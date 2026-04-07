class Libro {
    String titulo;
    String autor;
    int paginas;

    void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}

public class Ejercicio21 {
    public static void main(String[] args) {
        
        // Creamos el primer objeto
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez"; // <--- MISMO VALOR
        libro1.paginas = 417;

        // Creamos el segundo objeto
        Libro libro2 = new Libro();
        libro2.titulo = "Crónica de una muerte anunciada";
        libro2.autor = "Gabriel García Márquez"; // <--- MISMO VALOR
        libro2.paginas = 120;

        System.out.println("--- LIBRO 1 ---");
        libro1.mostrarInfo();

        System.out.println("\n--- LIBRO 2 ---");
        libro2.mostrarInfo();

        System.out.println("\n--- EXPLICACIÓN EJERCICIO 21 ---");
        System.out.println("Ambos objetos comparten exactamente el mismo valor en el atributo 'autor' (" + libro1.autor + "),");
        System.out.println("pero son objetos independientes con valores distintos en 'titulo' y 'paginas'.");
    }
}