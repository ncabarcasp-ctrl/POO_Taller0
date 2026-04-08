class Estudiante {
    String nombre;
    int codigo;
    int semestre;

    public Estudiante() {
    }

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1; // Asignar semestre por defecto
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
        Estudiante est1 = new Estudiante();
        est1.nombre = "Natalia";
        est1.codigo = 12345;
        est1.semestre = 2;
        
        Estudiante est2 = new Estudiante("Maluma", 54321);
        Estudiante est3 = new Estudiante("Sabrina Carpenter", 67990, 5);
        
        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();

        est1.cambiarSemestre(3);
        System.out.println("DESPUES DE CAMBIAR SEMESTRE ");
        est1.mostrarInfo();
    }
}
