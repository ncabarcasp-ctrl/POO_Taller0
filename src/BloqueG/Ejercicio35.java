class Lampara {
    String marca;
    Boolean encendida;

    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false;
    }

    void encender() {
        encendida = true;
    }

    void apagar() {
        encendida = false;
    }

    void mostrarEstado() {
        System.out.println("La lámpara " + marca + " está " + (encendida ? "ENCENDIDA" : "APAGADA") + ".");
    }
}

public class Ejercicio35 {
    public static void main(String[] args) {
    }
}
