class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    public CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    void mostrarCuenta() {
        System.out.println("Número de cuenta: " + numero + ", Titular: " + titular + ", Saldo: $" + saldo);
    }
    void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("ERROR: El monto a consignar debe ser mayor que cero.");
        }
    }

    void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("TRANSACCIÓN FALLIDA: Fondos insuficientes. Tiene saldo de $" + saldo + " y trató de retirar $" + monto);
        }
    }
}

public class Ejercicio27 {
    public static void main(String[] args) {
    }
        
}