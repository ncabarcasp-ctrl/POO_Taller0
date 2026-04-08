class Celular {
    private String marca;
    private int bateria;
    private boolean prendido;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = Math.max(0, Math.min(bateria, 100));
        this.prendido = false; // estado inicial controlado
    }

    public void encender() {
        if (prendido) {
            System.out.println("El " + marca + " ya está encendido.");
        } else if (bateria > 0) {
            prendido = true;
        } else {
            System.out.println("No se puede encender el " + marca + ". Batería agotada.");
        }
    }

    public void apagar() {
        prendido = false;
    }

    public void cargarBateria(int cantidad) {
        if (cantidad > 0) {
            bateria = Math.min(100, bateria + cantidad);
        }
    }

    public void usar(int minutos) {
        if (minutos <= 0) {
            System.out.println("Cantidad inválida de uso.");
            return;
        }

        if (!prendido) {
            System.out.println("Acción denegada: No puedes usar el " + marca + " porque está apagado.");
            return;
        }

        bateria = Math.max(0, bateria - minutos);

        if (bateria == 0) {
            prendido = false;
            System.out.println(" ¡Batería agotada! El " + marca + " se ha apagado automáticamente.");
        } else if (bateria <= 15) {
            System.out.println("⚠️ ADVERTENCIA: Batería baja en el " + marca + " (" + bateria + "%). ¡Conecta el cargador!");
        }
    }

    public void mostrarEstado() {
        System.out.println("Celular " + marca + " | Batería: " + bateria + "% | Estado: " + (prendido ? "ENCENDIDO" : "APAGADO"));
    }
}

public class Ejercicio37 {
    public static void main(String[] args) {
        Celular miPhone = new Celular("iPhone", 25);

        miPhone.mostrarEstado();

        System.out.println("--- Encendiendo ---");
        miPhone.encender();

        System.out.println("--- Usando 12 minutos ---");
        miPhone.usar(12);

        System.out.println("--- Usando 15 minutos más ---");
        miPhone.usar(15);

        miPhone.mostrarEstado();
    }
}