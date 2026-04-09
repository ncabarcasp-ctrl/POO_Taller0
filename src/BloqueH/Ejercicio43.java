class Computador {
    String marca;
    String procesador;
    int ram;

    public Computador(String marca, String procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    void mostrarEspecificaciones() {
        System.out.println("Computador: " + marca + " | Procesador: " + procesador + " | RAM: " + ram + "GB");
    }
}

public class Ejercicio43 {
    public static void main(String[] args) {
        Computador miPc = new Computador("ASUS", "Intel core i7", 16);

        miPc.mostrarEspecificaciones();

        System.out.println("\n--- PLANO CONCEPTUAL VS MÁQUINA CONCRETA ---");
    System.out.println("El plano conceptual, representado por la clase Computador, es una abstracción");
    System.out.println("que define las características y comportamientos que deben tener los objetos,");
    System.out.println("pero no representa un elemento real por sí mismo.");
    System.out.println("En cambio, la máquina concreta es una instancia de esa clase, es decir, un objeto");
    System.out.println("creado a partir del plano, que ocupa memoria y contiene valores específicos.");
    System.out.println("Mientras la clase define el modelo, el objeto representa una entidad real");
    System.out.println("con datos propios dentro del programa.");
    
    }
}
