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
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta1.numero = "123456789";
        cuenta1.titular = "Natalia Cabarcas";
        cuenta1.saldo = 1500.75;

        cuenta2.numero = "987654321";
        cuenta2.titular = "Karol G";
        cuenta2.saldo = 2500.00;
        
        System.out.println("Saldos iniciales:");
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        System.out.println("\nConsignando $500 a la cuenta de Natalia Cabarcas...");
        cuenta1.consignar(500.00);

        System.out.println("Saldos después de la consignación:");
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}