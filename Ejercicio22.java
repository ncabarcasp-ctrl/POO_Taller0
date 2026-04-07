class Libro {
    String titulo;
    String autor;

    void mostrarLibro() {
        System.out.println("📖 " + titulo + " (por " + autor + ")");
    }
}

public class Ejercicio22 {
    public static void main(String[] args) {
        
        // 1. Creando los 4 objetos distintos (Casos concretos)
        Libro libro1 = new Libro();
        libro1.titulo = "El Principito";
        libro1.autor = "Antoine de Saint-Exupéry";

        Libro libro2 = new Libro();
        libro2.titulo = "1984";
        libro2.autor = "George Orwell";

        Libro libro3 = new Libro();
        libro3.titulo = "El Hobbit";
        libro3.autor = "J.R.R. Tolkien";

        Libro libro4 = new Libro();
        libro4.titulo = "Orgullo y Prejuicio";
        libro4.autor = "Jane Austen";

        System.out.println("--- MIS 4 CASOS CONCRETOS (OBJETOS) ---");
        libro1.mostrarLibro();
        libro2.mostrarLibro();
        libro3.mostrarLibro();
        libro4.mostrarLibro();

        // 2. Conclusión final impresa en consola
        System.out.println("\n--- CONCLUSIÓN: CLASE VS OBJETO ---");
        System.out.println("La clase 'Libro' es la PLANTILLA porque solo define las características");
        System.out.println("generales (título y autor) sin tener datos reales. Es como un formulario vacío.");
        System.out.println("En cambio, libro1, libro2, libro3 y libro4 son CASOS CONCRETOS porque son");
        System.out.println("materializaciones de ese molde: tienen datos específicos, existen en la");
        System.out.println("memoria de la computadora y representan libros reales y únicos.");
    }
}