//  Para este escogí el Ejercicio 7 del bloque B
class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    //  Constructor estándar con parámetros (para crear el original)
    public Vehiculo(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    // | EL CONSTRUCTOR COPIA |
    // Recibe otro objeto de la misma clase como "molde"
    public Vehiculo(Vehiculo otroVehiculo) {
        this.marca = otroVehiculo.marca;
        this.modelo = otroVehiculo.modelo;
        this.velocidadActual = otroVehiculo.velocidadActual;
    }

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        System.out.println("-------------------------");
    }
}

public class Ejercicio73 {
    public static void main(String[] args) {
        // Creamos el auto original
        Vehiculo carroOriginal = new Vehiculo("Toyota", "Corolla", 60);
        
        // Usamos la "máquina clonadora": le pasamos el objeto original al constructor copia
        Vehiculo carroClonado = new Vehiculo(carroOriginal);

        // Para demostrar que son dos objetos distintos en memoria, 
        // vamos a acelerar SOLO el carro clonado
        carroClonado.velocidadActual = 80;

        System.out.println("--- AUTO ORIGINAL ---");
        carroOriginal.mostrarEstado();

        System.out.println("--- AUTO CLONADO (Y ACELERADO) ---");
        carroClonado.mostrarEstado();
    }
}