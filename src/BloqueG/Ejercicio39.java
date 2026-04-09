class Cancion {
    String titulo;
    String artista;
    double duracion; // en minutos

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion > 0 ? duracion : 0;

    }

    void mostrarInfo() {
        System.out.println("Cancion: " + titulo + " | Artista: " + artista + " | Duracion: " + duracion + " min");
    }

}

public class Ejercicio39 {
    public static void main(String[] args) {
        
    }
}