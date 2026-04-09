//Ejercicio 53: Crea una clase Reserva con: nombreCliente, fecha, activa, Agrega métodos para confirmar y cancelar

class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public Reserva(String nombreCliente, String fecha, boolean activa) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    void confirmar() {
        activa = true;
        System.out.println(" Acción: Confirmando reserva...");
    }

    void cancelar() {
        activa = false;
        System.out.println(" Acción: Cancelando reserva...");
    }

    void mostrarEstado() {
        if (activa) {
            System.out.println("Reserva de " + nombreCliente + " para el " + fecha + " | Estado: CONFIRMADA");
        } else {
            System.out.println("Reserva de " + nombreCliente + " para el " + fecha + " | Estado: CANCELADA");
        }
    }
}

public class Ejercicio53 {
    public static void main(String[] args) {

        Reserva miReserva = new Reserva("Carlos Ruiz", "20/11/2026", false);
        
        miReserva.mostrarEstado();
        
        miReserva.confirmar();
        miReserva.mostrarEstado();
        
        miReserva.cancelar();
        miReserva.mostrarEstado();
    }
}
