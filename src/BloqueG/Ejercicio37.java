class Celular {
    private String marca;
    private int bateria;
    private boolean prendido;

    public Celular( String marca, int bateria) {
        this.marca = marca;
        this.bateria = Math.max(0, Math.min(bateria, 100));
        this.prendido = false;
    }

    public void encender() {
        if (bateria > 0){
            prendido =true;
        } else {
            System.out.println("No se puede encender el " + marca + ". Bateria agotada.");
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
        if (!prendido) {
            System.out.println("Accion denegada: No se puede usar el " + marca + " porque esta apagado");
            return;
        }
        bateria = Math.max(0,bateria - minutos);

        if (bateria ==0) {
            prendido = false;
            System.out.println("¡Bateria agotada! El " + marca + " se ha apagado automaticamente");
        }
    }
    public void mostrarEstado() {
        System.out.println("Celular " + marca + " | Batería: " + bateria + "% | Estado: " + (prendido ? "ENCENDIDO" : "APAGADO"));
    }
} 

public class Ejercicio37 { 
    public static void main(String[] args) {
        Celular miPhone = new Celular("Iphone", 15);

        miPhone.usar(10);
        miPhone.encender();
        miPhone.mostrarEstado();

        miPhone.usar(20);
        miPhone.mostrarEstado();
    }
}