class Temperatura {
    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    double convertirAFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    void mostrarConversion() {
        System.out.println("Temperatura: " + celsius + "°C equivalen a " + convertirAFahrenheit() + "°F");
    }
}

public class Ejercicio56 {
    public static void main(String[] args) {
        Temperatura climaHoy = new Temperatura(28.5);
        
        climaHoy.mostrarConversion();
    }
}