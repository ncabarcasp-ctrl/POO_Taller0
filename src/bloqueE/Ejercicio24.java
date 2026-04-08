class Libro24 {
    String titulo;
    String autor;

    public Libro24(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }
void mostrarLibro() {
    System.out.println("Libro: " + titulo + " | Autor: " + autor);
    }
}

public class Ejercicio24 {
    public static void main(String[] args) {
        Libro24 miLibro = new Libro24("El Quijote", "Miguel de Cervantes");
        
        miLibro.mostrarLibro();
    }
}