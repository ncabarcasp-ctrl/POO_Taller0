// Diseño de la Clase: Tienda

// 1. Atributos (Estado)
// nombre (`String`): El nombre comercial del establecimiento.
// direccion (`String`): La ubicación del local.
// dineroEnCaja (`double`): El efectivo disponible producto de las ventas.
// abierta (`boolean`): Indica si el negocio está operando o si ya cerró.

// 2. Métodos (Comportamiento)
// abrir(): Cambia el estado a `true` indicando que empieza la jornada.
// cerrar(): Cambia el estado a `false` indicando que finaliza la jornada.
// vender(double monto): Si la tienda está abierta, suma el monto al `dineroEnCaja`. Si está cerrada, rechaza la operación.
// mostrarEstado(): Imprime el reporte financiero y operativo de la tienda.

// 3. Objetos Reales (Instancias)
// Objeto 1: Nombre: "Supermercado Olímpica"
  // Dirección: "Av. Pedro de Heredia, Cartagena"
  // Dinero en Caja: 500000.0
  // Abierta: true

// Objeto 2: Nombre: "Tienda Don Pepe"
  // Dirección: "Barrio Getsemaní"
  // Dinero en Caja: 15000.0
  // Abierta: false

  class Tienda {
    String nombre;
    String direccion;
    double dineroEnCaja;
    boolean abierta;

    public Tienda(String nombre, String direccion, double dineroEnCaja, boolean abierta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dineroEnCaja = dineroEnCaja;
        this.abierta = abierta;
    }

    void abrir() {
        abierta = true;
        System.out.println("🏪 " + nombre + " ha ABIERTO sus puertas.");
    }

    void cerrar() {
        abierta = false;
        System.out.println("🚪 " + nombre + " ha CERRADO por hoy.");
    }

    void vender(double monto) {
        if (abierta) {
            dineroEnCaja = dineroEnCaja + monto;
            System.out.println(" Venta realizada por $" + monto + ". Nuevo saldo: $" + dineroEnCaja);
        } else {
            System.out.println(" Operación rechazada: La tienda está cerrada.");
        }
    }

    void mostrarEstado() {
        System.out.println("--- REPORTE DE TIENDA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Dinero en caja: $" + dineroEnCaja);
        System.out.println("Estado: " + (abierta ? "Abierta" : "Cerrada"));
    }
}

public class Ejercicio64 {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda("Tienda Don Pepe", "Barrio Getsemaní", 15000.0, false);
        
        miTienda.mostrarEstado();
        
        miTienda.vender(5000.0);
        
        miTienda.abrir();
        miTienda.vender(5000.0);
        miTienda.vender(12500.0);
        
        miTienda.cerrar();
        miTienda.mostrarEstado();
    }
}