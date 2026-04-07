class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado() {
        System.out.println("Marca: " + marca + " | " + "Modelo: " + modelo + " | " + "Velocidad Actual: " + velocidadActual + " km/h");
    }

  void acelerar() {
    velocidadActual += 10;

  }

}

public class Ejercicio11 {
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidadActual = 60;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.velocidadActual = 80;

        System.out.println("--- ANTES DE ACELERAR ---");
        
        carro1.mostrarEstado();

        carro1.acelerar();

        System.out.println("--- DESPUÉS DE ACELERAR ---");
        carro1.mostrarEstado();
        carro2.mostrarEstado();

    }
}