class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void mostrarCuenta() {
        System.out.println("Número: " + numero + " | " + "Titular: " + titular + " | " + "Saldo: $" + saldo);
    }

 void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Error: El valor a consignar debe ser mayor que cero.");
        }
    }
}
 public class Ejercicio13 {
}