class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo();
    }
}
    