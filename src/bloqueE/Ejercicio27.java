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
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "Natalia", 5000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("987654321", "Karol G", 2500.0);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        cuenta1.retirar(1000.0);
        cuenta2.retirar(3000.0);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
        
}