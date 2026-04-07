class Estudiante {
    String nombre;
    int codigo;
    int semestre;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }

    void cambiarSemestre(int nuevoSemestre) {
        
        if (nuevoSemestre > 0) {
            semestre = nuevoSemestre;
        } else {
            System.out.println("ERROR: El semestre debe ser un número mayor a 0.");
        } 
}

}

public class Ejercicio17 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Natalia";
        estudiante1.codigo = 12345;
        estudiante1.semestre = 2;

        System.out.println(" ESTADO INICIAL ");
        estudiante1.mostrarInfo();

        // Simulamos que la estudiante pasó todas las materias asi que avanza de semestre
        
        System.out.println("\nFELICIDADES: " + estudiante1.nombre + " has avanzado al siguiente semestre! | Pasando al siguiente semestre...");
        estudiante1.cambiarSemestre(3);
        System.out.println("\n ESTADO ACTUALIZADO ");
        estudiante1.mostrarInfo(); // EL semestre debería haber cambiado a 3

    }

}
