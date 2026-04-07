class veehiculo {
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
}