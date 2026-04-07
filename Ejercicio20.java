// 1. LA CLASE (EL MOLDE)
class Pelicula {
    String titulo;
    String genero;
}

public class Ejercicio20 {
    public static void main(String[] args) {
        
        // 2. CREANDO TRES OBJETOS DE LA MISMA CLASE
        Pelicula peli1 = new Pelicula();
        peli1.titulo = "Shrek";
        peli1.genero = "Comedia Animada";

        Pelicula peli2 = new Pelicula();
        peli2.titulo = "El Conjuro";
        peli2.genero = "Terror";

        Pelicula peli3 = new Pelicula();
        peli3.titulo = "Avengers";
        peli3.genero = "Acción";

        System.out.println("Película 1: " + peli1.titulo);
        System.out.println("Película 2: " + peli2.titulo);
        System.out.println("Película 3: " + peli3.titulo);

        /* * RESPUESTA AL EJERCICIO 20:
         * * ¿QUÉ COMPARTEN peli1, peli2 y peli3?
         * Comparten exactamente la misma ESTRUCTURA (el molde 'Pelicula'). 
         * Los tres objetos tienen derecho a usar los mismos atributos ('titulo' y 'genero') 
         * y los mismos métodos (si la clase los tuviera).
         * * ¿EN QUÉ SE DIFERENCIAN?
         * Se diferencian en su ESTADO y en su IDENTIDAD.
         * 1. Estado: Cada objeto tiene valores únicos almacenados en sus variables 
         * (Shrek es muy distinto a El Conjuro).
         * 2. Identidad: Son tres "espacios" independientes en la memoria de la computadora. 
         * Si modificamos o borramos 'peli1', 'peli2' y 'peli3' no se ven afectadas en lo absoluto.
         */
    }
}
