class Pelicula {
    String nombre;
    String genero;
    int minutos;

        public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    void mostrarFicha() {

        System.out.println("Pelicula: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " min");

    }
}

public class Ejercicio40 {
    public static void main(String[] args) {
        
    }
}