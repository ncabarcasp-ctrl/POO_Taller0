// Ejercicio 53: Crea una clase Reserva con: nombreCliente,fecha, activa. Agrega métodos para confirmar y cancelar

class Semaforo {
    String color;

    public Semaforo(String color) {
        this.color = color;
    }

    void cambiarColor() {
        if (color.equals("Rojo")) {
            color = "Verde";
        } else if (color.equals("Verde")) {
            color = "Amarillo";
        } else if (color.equals("Amarillo")) {
            color = "Rojo";
        } else {
            color = "Rojo";
        }
    }

    void mostrarEstado() {
        System.out.println("Estado del semáforo: " + color);
    }
}

public class Ejercicio54 {
    public static void main(String[] args) {
        Semaforo miSemaforo = new Semaforo("Rojo");
        
        miSemaforo.mostrarEstado();
        
        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();
        
        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();
        
        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();
    }
}