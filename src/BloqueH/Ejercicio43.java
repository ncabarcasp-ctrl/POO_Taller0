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
        
    }
}
