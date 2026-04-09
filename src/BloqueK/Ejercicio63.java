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