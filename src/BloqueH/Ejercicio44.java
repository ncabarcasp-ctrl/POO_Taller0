class Paciente {
    String nombre;
    int edad;
    String motivoConsulta;

    public Paciente(String nombre, int edad, String motivoConsulta) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivoConsulta = motivoConsulta;
    }

    void mostrarDatos() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " años | Consulta: " + motivoConsulta);
    }
}

public class Ejercicio44 {
    public static void main(String[] args) {
        
    }
}
