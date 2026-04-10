class TareaUniversitaria {
    String materia;
    String descripcion;
    String fechaEntrega;
    boolean entregada;

    public TareaUniversitaria(String materia, String descripcion, String fechaEntrega) {
        this.materia = materia;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.entregada = false; // Estado inicial lógico por defecto
    }

    void marcarComoEntregada() {
        entregada = true;
        System.out.println("✅ ¡Excelente trabajo! La tarea de " + materia + " ha sido entregada exitosamente.");
    }

    void mostrarTarea() {
        System.out.println("--- DETALLE DE LA TAREA ---");
        System.out.println("Materia: " + materia);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha límite: " + fechaEntrega);
        System.out.println("Estado: " + (entregada ? "Completada y Entregada" : "Pendiente"));
    }
}

public class Ejercicio67 {
    public static void main(String[] args) {
        TareaUniversitaria miProyecto = new TareaUniversitaria(
            "POO",
            "Resolver ejercicios prácticos de Java",
            "14 de abril"
        );
        
        miProyecto.mostrarTarea();
        
        miProyecto.marcarComoEntregada();
        
        miProyecto.mostrarTarea();
    }
}