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
    }
}