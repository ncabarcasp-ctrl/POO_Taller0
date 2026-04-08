class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;
    static final int MAX_VELOCIDAD = 3;

    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    public void encender() {
        if (encendido) {
            System.out.println("El ventilador ya está encendido.");
        } else {
            encendido = true;
            velocidad = 1;
        }
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void subirVelocidad() {
        if (!encendido) {
            System.out.println("No se puede subir velocidad: el ventilador está apagado.");
            return;
        }

        if (velocidad < MAX_VELOCIDAD) {
            velocidad++;
        } else {
            System.out.println("Velocidad máxima (" + MAX_VELOCIDAD + ") alcanzada.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Ventilador " + marca +
                " | Estado: " + (encendido ? "ENCENDIDO" : "APAGADO") +
                " | Velocidad: " + velocidad);
    }
}

public class Ejercicio38 {
    public static void main(String[] args) {
        Ventilador miVent = new Ventilador("Samurai Pro");

        miVent.subirVelocidad();
        miVent.encender();
        miVent.mostrarEstado();

        miVent.subirVelocidad();
        miVent.subirVelocidad();
        miVent.subirVelocidad();

        miVent.mostrarEstado();

        miVent.apagar();
        miVent.mostrarEstado();

    }
}