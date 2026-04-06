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
    }
}