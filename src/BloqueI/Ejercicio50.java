// El Código Incompleto

// class Libro {
   // String titulo;

    // public Libro(String titulo) {
       // this.titulo = titulo;
    // }

    // void abrir() {
       //  System.out.println("Abriendo el libro: " + titulo);
    //}
//}

//public class Ejercicio50 {
  //  public static void main(String[] args) {
    //    System.out.println("¡Bienvenido a la biblioteca!");
    //}
//}

// El Código Corregido

class Libro {
    String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    void abrir() {
        System.out.println("Abriendo el libro: " + titulo);
    }
}

public class Ejercicio50 {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a la biblioteca!");
        
        Libro miLibro = new Libro("El Principito");
        
        miLibro.abrir();
    }
}