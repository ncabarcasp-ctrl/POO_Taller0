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
}
