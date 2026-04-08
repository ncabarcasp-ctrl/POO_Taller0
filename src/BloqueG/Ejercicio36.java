class Puerta {
    String material;
    Boolean abierta;

    void abrir() {
        abierta = true;
    }
    void cerrar() {
        abierta = false;
    }
    void mostrarEstado() {
        if (abierta) {
            System.out.println("La puerta de " + material + " está ABIERTA");
        } else {
            System.out.println("La puerta de " + material + " está CERRADA");
        }
    }
}
public class Ejercicio36 {
    public static void main(String[] args) {
    }
}