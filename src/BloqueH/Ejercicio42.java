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
    }
}