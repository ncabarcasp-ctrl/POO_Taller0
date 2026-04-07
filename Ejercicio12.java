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
  void frenar() {
    velocidadActual -= 10;
    if (velocidadActual < 0) {
        velocidadActual = 0;
    }
  }
}

public class Ejercicio12 {
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidadActual = 5;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.velocidadActual = 80;

        System.out.println("--- ANTES DE FRENAR ---");
        carro1.mostrarEstado();
        carro2.mostrarEstado();

        // aplicamos freno SOLO al Toyota
        carro1.frenar();

        System.out.println("--- DESPUÉS DE FRENAR ---");
        carro1.mostrarEstado();
        carro2.mostrarEstado();
    }

}