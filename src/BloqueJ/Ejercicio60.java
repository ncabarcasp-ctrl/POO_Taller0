class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    void abordar(int cantidad) {
        pasajeros = pasajeros + cantidad;
        System.out.println(" Abordaje exitoso: " + cantidad + " pasajeros han subido al avión.");
    }

    void mostrarVuelo() {
        System.out.println("Vuelo de " + aerolinea + " con destino a " + destino + " | Pasajeros a bordo: " + pasajeros);
    }
}

public class Ejercicio60 {
    public static void main(String[] args) {
        
        Avion miVuelo = new Avion("Avianca", "Cartagena", 120);
        
        miVuelo.mostrarVuelo();
        
        miVuelo.abordar(35);
        
        miVuelo.mostrarVuelo();
    }
}