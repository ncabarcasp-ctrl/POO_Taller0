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
        Paciente paciente1 = new Paciente("Ryan Castro", 32, "Dolor de garganta");

        paciente1.mostrarDatos();

        System.out.println("\n--- 'CREAR UN PACIENTE' VS 'INSTANCIAR LA CLASE PACIENTE' ---");
    System.out.println("'Crear un paciente' es un concepto del mundo real o del negocio,");
    System.out.println("donde una persona es registrada y pasa a formar parte del sistema clínico.");
    System.out.println("'Instanciar la clase Paciente' es la acción técnica en programación,");
    System.out.println("que consiste en crear un objeto usando 'new', asignándole memoria y valores.");
    System.out.println("Ambos conceptos se relacionan porque la instanciación es la forma en que");
    System.out.println("representamos en el software la creación de un paciente en la realidad.");
    
    }
}
