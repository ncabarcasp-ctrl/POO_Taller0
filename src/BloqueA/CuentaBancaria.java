public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    void mostrarCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

}
