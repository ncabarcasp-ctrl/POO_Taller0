// Diseño de la Clase: EquipoDeFutbol

//1. Atributos (Estado)
// nombre (`String`): El nombre oficial del club.
// estadio (`String`): La sede donde juegan de local.
// puntos (`int`): La cantidad de unidades acumuladas en el torneo.
// enPrimeraDivision (`boolean`): Indica si el equipo juega en la categoría A (`true`) o en la B (`false`).

// 2. Métodos (Comportamiento)
// ganarPartido(): Suma 3 al atributo `puntos`.
// empatarPartido(): Suma 1 al atributo `puntos`.
/// mostrarEstadisticas(): Imprime la información del club y su puntaje actual.

// 3. Objetos Reales (Instancias)
// Objeto 1: Nombre: "Real Cartagena"
  // Estadio: "Jaime Morón León"
  // Puntos: 0
  // En Primera División: false

// Objeto 2: Nombre: "Junior de Barranquilla"
  // Estadio: "Metropolitano Roberto Meléndez"
  // Puntos: 15
  // En Primera División: true

  class EquipoDeFutbol {
    String nombre;
    String estadio;
    int puntos;
    boolean enPrimeraDivision;

    public EquipoDeFutbol(String nombre, String estadio, int puntos, boolean enPrimeraDivision) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.puntos = puntos;
        this.enPrimeraDivision = enPrimeraDivision;
    }

    void ganarPartido() {
        puntos = puntos + 3;
        System.out.println("⚽ ¡GOLAZO! El " + nombre + " ha ganado el partido. (+3 puntos)");
    }

    void empatarPartido() {
        puntos = puntos + 1;
        System.out.println("⚖️ Partido muy reñido. El " + nombre + " ha empatado. (+1 punto)");
    }

    void mostrarEstadisticas() {
        System.out.println("--- ESTADÍSTICAS DEL CLUB ---");
        System.out.println("Equipo: " + nombre);
        System.out.println("Estadio: " + estadio);
        System.out.println("Puntos en el torneo: " + puntos);
        System.out.println("Categoría: " + (enPrimeraDivision ? "Primera A" : "Primera B"));
    }
}

public class Ejercicio65 {
    public static void main(String[] args) {
        
        EquipoDeFutbol miEquipo = new EquipoDeFutbol("Real Cartagena", "Jaime Morón León", 0, false);
        
        miEquipo.mostrarEstadisticas();
        
        miEquipo.ganarPartido();
        miEquipo.empatarPartido();
        miEquipo.ganarPartido();
        
        miEquipo.mostrarEstadisticas();
    }
}