class EstudianteProgramacion {
    String nombre;
    String lenguaje;
    int ejerciciosResueltos;
    boolean certificado;

    public EstudianteProgramacion(String nombre, String lenguaje, int ejerciciosResueltos, boolean certificado) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.ejerciciosResueltos = ejerciciosResueltos;
        this.certificado = certificado;
    }

    void resolverEjercicio() {
        ejerciciosResueltos++;
        System.out.println("💻 ¡" + nombre + " ha resuelto un nuevo ejercicio en " + lenguaje + "! Total: " + ejerciciosResueltos);
    }

    void obtenerCertificado() {
        if (ejerciciosResueltos >= 66) {
            certificado = true;
            System.out.println("🎓 ¡Felicidades! " + nombre + " ha obtenido su certificado de graduación.");
        } else {
            System.out.println("⏳ Aún te faltan ejercicios para el certificado. Llevas " + ejerciciosResueltos + ".");
        }
    }

    void mostrarProgreso() {
        System.out.println("--- PROGRESO DEL ESTUDIANTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Ejercicios resueltos: " + ejerciciosResueltos);
        System.out.println("Estado: " + (certificado ? "Graduado" : "En formación"));
    }
}

public class Ejercicio66 {
    public static void main(String[] args) {
    }
}