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

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.velocidadActual = 60;
        
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.velocidadActual = 80;

        carro1.mostrarEstado();
        carro2.mostrarEstado();

    }
}
    