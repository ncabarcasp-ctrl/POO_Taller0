class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    // Ocultamos el constructor haciéndolo privado. 
    // Ahora la única forma de obtener una cuenta será usando la fábrica.
    private CuentaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // EL MÉTODO FÁBRICA | Es 'static' porque lo llamaremos desde la propia clase.
    public static CuentaBancaria abrirCuenta(String numero, String titular, double saldoInicial) {
        // Aquí adentro la clase sí puede usar el 'new' para construir el objeto
        // Además, en el futuro aquí podríamos poner reglas (ej. no abrir cuentas con saldo negativo)
        System.out.println("🏦 Procesando apertura de cuenta para: " + titular);
        return new CuentaBancaria(numero, titular, saldoInicial);
    }

    void mostrarCuenta() {
        
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("-------------------------");
    }
}

public class Ejercicio72 {
    public static void main(String[] args) {

        System.out.println("--- SISTEMA BANCARIO INICIADO ---\n");

        // Ya no usamos 'new'. Ahora le pedimos a la CLASE que nos fabrique el objeto.
        // Ahora podemos obsevsar lo descriptivo y natural que se lee esto
        CuentaBancaria cuenta1 = CuentaBancaria.abrirCuenta("123456789", "Natalia Cabarcas", 1500.75);
        CuentaBancaria cuenta2 = CuentaBancaria.abrirCuenta("987654321", "Karol G", 2500.00);

        System.out.println("\n--- CUENTAS ACTIVAS ---");
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}