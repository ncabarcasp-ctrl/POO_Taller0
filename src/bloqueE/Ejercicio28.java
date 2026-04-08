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
        System.out.println("Número: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
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
        public class Ejercicio28 {
            public static void main(String[] args) {
                CuentaBancaria cuenta1 = new CuentaBancaria("111222", "Ariana Grande", 5000.0);
                CuentaBancaria cuenta2 = new CuentaBancaria("987654321", "Conan Gray", 2500.0);
                CuentaBancaria cuenta3 = new CuentaBancaria("123456789", "Taylor Swift", 10000.0);

                cuenta1.mostrarCuenta();
                cuenta2.mostrarCuenta();
                cuenta3.mostrarCuenta();
            }
        }
