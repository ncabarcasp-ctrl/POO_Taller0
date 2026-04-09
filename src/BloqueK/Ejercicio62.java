// Diseño de la Clase: Biblioteca

// 1. Atributos (Estado)
// nombre (`String`): El nombre de la institución.
// direccion (`String`): Ubicación física.
// cantidadLibros (`int`): El total de ejemplares disponibles.
// abierta (`boolean`): Estado actual (si está atendiendo al público o no).

// 2. Métodos (Comportamiento)
// abrir() / cerrar(): Cambian el estado del atributo `abierta`.
// prestarLibro(): Resta 1 a la `cantidadLibros` (si hay disponibles y está abierta).
// devolverLibro(): Suma 1 a la `cantidadLibros`.
// mostrarEstado(): Imprime toda la información de la biblioteca.

// 3. Objetos Reales (Instancias)
// Objeto 1:  Nombre: "Biblioteca Luis Ángel Arango"
  // Dirección: "Calle 11 # 4-14, Bogotá"
  // Cantidad de Libros: 50000
  // Abierta: true

// Objeto 2:  Nombre: "Biblioteca Nacional de España"
  // Dirección: "Paseo de Recoletos, Madrid"
  // Cantidad de Libros: 120000
  // Abierta: false

  class Biblioteca {
    String nombre;
    String direccion;
    int cantidadLibros;
    boolean abierta;

    public Biblioteca(String nombre, String direccion, int cantidadLibros, boolean abierta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadLibros = cantidadLibros;
        this.abierta = abierta;
    }

    void abrir() {
        abierta = true;
        System.out.println(" La biblioteca " + nombre + " ahora está ABIERTA.");
    }

    void cerrar() {
        abierta = false;
        System.out.println(" La biblioteca " + nombre + " ahora está CERRADA.");
    }

    void prestarLibro() {
        if (abierta && cantidadLibros > 0) {
            cantidadLibros--;
            System.out.println(" Libro prestado. Quedan: " + cantidadLibros);
        } else {
            System.out.println(" No se puede prestar (Cerrado o sin stock).");
        }
    }

    void mostrarEstado() {
        System.out.println("--- INFORMACIÓN ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Libros: " + cantidadLibros);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}

public class Ejercicio62 {
    public static void main(String[] args) {
        
        Biblioteca miBiblio = new Biblioteca("Luis Ángel Arango", "Calle 11, Bogotá", 10, false);
        
        miBiblio.mostrarEstado();
        miBiblio.prestarLibro(); // Debería fallar porque está cerrada
        
        miBiblio.abrir();
        miBiblio.prestarLibro(); // Debería funcionar
        
        miBiblio.mostrarEstado();
    }
}