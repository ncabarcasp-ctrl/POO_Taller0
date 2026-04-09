//  Diseño de la Clase: Hospital

// 1. Atributos (Estado)
// nombre (`String`): El nombre del centro de salud.
// direccion (`String`): Ubicación de las instalaciones.
// camasDisponibles (`int`): Cuántas camas libres hay para nuevos ingresos.
// emergenciaAbierta (`boolean`): Si el área de urgencias está recibiendo pacientes.

// 2. Métodos (Comportamiento)
// ingresarPaciente(): Verifica si hay emergencias abiertas y camas disponibles. Si es así, resta 1 a `camasDisponibles`.
// darDeAlta(): Libera una cama sumando 1 a `camasDisponibles`.
// mostrarEstado(): Imprime un reporte general de la capacidad del hospital.

// 3. Objetos Reales (Instancias)
// Objeto 1:  Nombre: "Hospital de Bocagrande"
  // Dirección: "Cl. 5 #6-49, Cartagena"
  // Camas Disponibles: 15
  // Emergencia Abierta: true

// Objeto 2: Nombre: "Clínica San José"
  // Dirección: "Centro Histórico"
  // Camas Disponibles: 0
  // Emergencia Abierta: false

  class Hospital {
    String nombre;
    String direccion;
    int camasDisponibles;
    boolean emergenciaAbierta;

    public Hospital(String nombre, String direccion, int camasDisponibles, boolean emergenciaAbierta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.camasDisponibles = camasDisponibles;
        this.emergenciaAbierta = emergenciaAbierta;
    }

    void ingresarPaciente() {
        if (emergenciaAbierta && camasDisponibles > 0) {
            camasDisponibles--;
            System.out.println(" Paciente ingresado. Camas disponibles: " + camasDisponibles);
        } else {
            System.out.println(" Ingreso rechazado: Urgencias cerradas o sin camas.");
        }
    }

    void darDeAlta() {
        camasDisponibles++;
        System.out.println(" Paciente dado de alta. Camas disponibles: " + camasDisponibles);
    }

    void mostrarEstado() {
        System.out.println("--- REPORTE DEL HOSPITAL ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Camas Libres: " + camasDisponibles);
        System.out.println("Urgencias: " + (emergenciaAbierta ? "Abiertas" : "Cerradas"));
    }
}

public class Ejercicio63 {
    public static void main(String[] args) {
        Hospital miHospital = new Hospital("Hospital de Bocagrande", "Cl. 5 #6-49, Cartagena", 2, true);
        
        miHospital.mostrarEstado();
        
        miHospital.ingresarPaciente();
        miHospital.ingresarPaciente();
        miHospital.ingresarPaciente(); 
        
        miHospital.darDeAlta();
        miHospital.mostrarEstado();
    }
}