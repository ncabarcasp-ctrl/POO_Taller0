class Libro33 {
 String titulo;
 String autor;

    public Libro33(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    }

    public Libro33(Libro33 otroLibro) {
    this.titulo = otroLibro.titulo;
    this.autor = otroLibro.autor;
    }

    void mostrarLibro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}

public class Ejercicio33 {
    public static void main(String[] args) {
        Libro33 libroOriginal = new Libro33("El principito", "Antoine de Saint-Exupéry");
        Libro33 libroCopia = new Libro33(libroOriginal);

        System.out.println("LIBRO ORIGINAL:");
        libroOriginal.mostrarLibro();

        System.out.println("LIBRO COPIA:");
        libroCopia.mostrarLibro();
    }
}