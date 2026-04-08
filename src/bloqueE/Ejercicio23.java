class Libro {
    String titulo;
    String autor;

    public Libro() {
        System.out.println("Se ha creado un libro usando el constructor vacío");
}
void mostrarLibro() {
    System.out.println("Libro: " + titulo + " | Autor: " + autor);
}

}
public class Ejercicio23 {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        miLibro.titulo = "El Quijote";   
        miLibro.autor = "Miguel de Cervantes";
        
        miLibro.mostrarLibro();
    }
}
