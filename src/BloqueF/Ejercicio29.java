class Estudiante {
    String nombre;
    int codigo;
    int semestre;

    public Estudiante() {
    }

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, int codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;

    }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | codigo: " + codigo + " | semestre: " + semestre);
    }
    
    void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
    }
}

public class Ejercicio29 {
    public static void main(String[] args) {
    }
}
