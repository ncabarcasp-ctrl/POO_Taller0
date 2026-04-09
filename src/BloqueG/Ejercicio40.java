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
        Pelicula peli1 = new Pelicula("Las Tortugas Ninja 2", "Ciencia Ficcion", 112);
        Pelicula peli2 = new Pelicula("Shrek", "Animación", 90);

        peli1.mostrarFicha();
        peli2.mostrarFicha();
    }
}