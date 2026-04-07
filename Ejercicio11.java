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
        Vehiculo carro = new Vehiculo();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.velocidadActual = 50;

        System.out.println("--- ANTES DE ACELERAR ---");
        
        carro.mostrarEstado();

        carro.acelerar();

        System.out.println("--- DESPUÉS DE ACELERAR ---");
        carro.mostrarEstado();

    }
}