//Ejercicio 52: Crea una clase FacturaSimple con: numero, cliente, valor. Agrega método para aplicar descuento del 10%

class FacturaSimple {
    int numero;
    String cliente;
    double valor;

    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    void aplicarDescuento() {
        double descuento = valor * 0.10;
        valor = valor - descuento;
        System.out.println(" ¡Descuento del 10% aplicado con éxito!");
        }

    void mostrarResumen() {
        System.out.println("Factura #" + numero + " | Cliente: " + cliente + " | Total a pagar: $" + valor);
    }
}

public class Ejercicio52 {
    public static void main(String[] args) {
    }
}