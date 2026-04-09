class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;

    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    void mostrarBoletin() {
        System.out.println("--- BOLETÍN DE CALIFICACIONES ---");
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Notas parciales: " + nota1 + " | " + nota2 + " | " + nota3);
        System.out.println("Nota Definitiva: " + calcularDefinitiva());
    }
}

public class Ejercicio57 {
    public static void main(String[] args) {
    }
}