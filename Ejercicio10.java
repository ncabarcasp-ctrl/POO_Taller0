class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    void mostrarCuenta() {
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
 public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta1.numero = "123456789";
        cuenta1.titular = "Natalia Cabarcas";
        cuenta1.saldo = 1500.75;

        cuenta2.numero = "987654321";
        cuenta2.titular = "Karol G";
        cuenta2.saldo = 2500.00;

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}