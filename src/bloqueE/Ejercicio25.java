class Libro25 {
    String titulo;
    String autor;

    public Libro25() {
    }

    public Libro25(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void mostrarLibro() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor);
    }
}

public class Ejercicio25 {
    public static void main(String[] args) {
        Libro25 libro1 = new Libro25();
        libro1.titulo = "Drácula";
        libro1.autor = "Bram Stoker";

        Libro25 libro2 = new Libro25("Frankenstein", "Mary Shelley");

        libro1.mostrarLibro();
        libro2.mostrarLibro();
    }
}