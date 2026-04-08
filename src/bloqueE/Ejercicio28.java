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
                
            }
        }
