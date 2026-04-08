class Estudiante30 {
    String nombre;
    int codigo;
    int semestre;

    public Estudiante30() {
    }

    public Estudiante30(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1;
    }

    public Estudiante30(String nombre, int codigo, int semestre) {
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

public class Ejercicio30 {
    public static void main(String[] args) {
        Estudiante30 est1 = new Estudiante30();
        est1.nombre = "Natalia";
        est1.codigo = 12345;
        est1.semestre = 2;
        
        Estudiante30 est2 = new Estudiante30("Maluma", 54321);
        
        Estudiante30 est3 = new Estudiante30("Sabrina Carpenter", 67990, 5);
        
        est1.mostrarInfo();
        est2.mostrarInfo();
        est3.mostrarInfo();
    }
}