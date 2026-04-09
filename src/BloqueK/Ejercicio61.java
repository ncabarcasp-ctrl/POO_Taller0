// Diseño de la Clase: Docente

//1. Atributos (Lo que el docente ES o TIENE)
// nombre (`String`): El nombre completo del profesor.
// asignatura (`String`): La materia principal que imparte.
// añosExperiencia (`int`): Cuántos años lleva dando clases.
// activo (`boolean`): Si actualmente está dando clases en la institución o está de vacaciones/licencia.

//2. Métodos (Lo que el docente HACE)
// darClase(): Imprime un mensaje indicando que el docente está impartiendo su asignatura.
// calificarExamen(double nota): Recibe una nota y determina si un alumno aprobó o reprobó.
// mostrarPerfil(): Muestra un resumen con todos los datos del docente.

// 3. Objetos Reales (Instancias que nacerán de este molde)
// Objeto 1:  Nombre: "Alan Turing"
  //Asignatura: "Criptografía"
  // Años de Experiencia: 10
  // Activo: true

// bjeto 2: Nombre: "Marie Curie"
  // Asignatura: "Física y Química"
// Años de Experiencia: 15
  // Activo: true

  // CODIGO:

  class Docente {
    String nombre;
    String asignatura;
    int aniosExperiencia;
    boolean activo;

    public Docente(String nombre, String asignatura, int aniosExperiencia, boolean activo) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.aniosExperiencia = aniosExperiencia;
        this.activo = activo;
    }

    void darClase() {
        System.out.println("El/la docente " + nombre + " está impartiendo su clase de " + asignatura + ".");
    }

    void calificarExamen(double nota) {
        if (nota >= 3.0) {
            System.out.println("Calificación: " + nota + " -> ¡Aprobado!");
        } else {
            System.out.println("Calificación: " + nota + " -> Reprobado.");
        }
    }

    void mostrarPerfil() {
        System.out.println("--- PERFIL DOCENTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Experiencia: " + aniosExperiencia + " años");
        System.out.println("¿Activo?: " + activo);
    }
}

public class Ejercicio61 {
    public static void main(String[] args) {
        Docente miProfe = new Docente("Marie Curie", "Física y Química", 15, true);
        
        miProfe.mostrarPerfil();
        miProfe.darClase();
        miProfe.calificarExamen(4.5);
        miProfe.calificarExamen(2.8);
    }
}