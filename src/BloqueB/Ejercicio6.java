class Estudiante {
    String nombre;
    int codigo;
    String semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
}

public class Ejercicio6 {
    public static void main(String[] args)
    {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Natalia";
        estudiante1.codigo = 12345;
        estudiante1.semestre = "Segundo";
        estudiante1.mostrarInfo();
    }
    
}