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
    }
        else {
        System.out.println("Error: El valor a consignar debe ser mayor que cero.");
        }
}

void retirar(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
    } else {
        System.out.println("Transacción fallida: Fondos insuficientes. Tiene saldo de $" + saldo + " y trataste de retirar $" + valor);
    }
}
    }
    public class Ejercicio14 {
        public static void main(String[] args) {
            CuentaBancaria cuenta2 = new CuentaBancaria();
            cuenta2.numero = "987654321";
            cuenta2.titular = "Karol G";
            cuenta2.saldo = 2500.0;

            System.out.println("--- ESTADO INICIAL ---");
            cuenta2.mostrarCuenta();

            // 1. Un retiro exitoso
            System.out.println("\nIntentando retirar $500...");
            cuenta2.retirar(500.0);
            cuenta2.mostrarCuenta(); // Deberia mostrar un saldo de $2000.00

            // 2. Un retiro fallido por fondos insuficientes
            System.out.println("\nIntentando retirar $3000.00..."); // Esto da error: Fondos insuficientes. Tiene saldo de $2000.00 + y trataste de retirar $3000.00
            cuenta2.retirar(3000.0);
            cuenta2.mostrarCuenta(); // Deberia mostrar un saldo de $2000.00 (sin cambios)
        }
    }
