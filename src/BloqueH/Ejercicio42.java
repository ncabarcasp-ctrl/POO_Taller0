class Curso {
    String nombre;
    int horas;
    String profesor;

    public Curso(String nombre, int horas, String profesor) {
        this.nombre = nombre;
        this.horas = horas;
        this.profesor = profesor;
    }

    void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Profesor: " + profesor + " | Duración: " + horas + "h");
    }
}

public class Ejercicio42 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Programación en Java", 40, "Jhon Arrieta");
        Curso curso2 = new Curso("Diseño Gráfico", 30, "Altamar");

        curso1.mostrarInfo();
        curso2.mostrarInfo();

        System.out.println("\n--- ¿POR QUÉ PERTENECEN A LA MISMA CLASE? ---");
    System.out.println("Ambos objetos pertenecen a la misma clase porque fueron creados a partir");
    System.out.println("del mismo molde, es decir, la clase Curso. Comparten la misma estructura");
    System.out.println("(atributos como nombre, horas y profesor) y el mismo comportamiento");
    System.out.println("(métodos como mostrarInfo), aunque tengan valores diferentes en sus datos.");
    System.out.println("Esto significa que son instancias distintas de la misma clase, cada una con su propio estado.");

    }
}