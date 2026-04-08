class Libro34 {
    String titulo;
    String autor;

    public Libro34(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro34(Libro34 otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
    }

    void mostrarLibro() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor);
    }
}

public class Ejercicio34 {
    public static void main(String[] args) {
        Libro34 libroOriginal = new Libro34("Orgullo y prejuicio", "Jane Austen");
        Libro34 libroCopia = new Libro34(libroOriginal);

        System.out.println("--- LIBRO ORIGINAL:");
        libroOriginal.mostrarLibro();
        System.out.println("--- LIBRO COPIA:");
        libroCopia.mostrarLibro();
    }
}