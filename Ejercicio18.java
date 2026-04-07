class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota() {
        System.out.println("Nombre: " + nombre + " | Especie: " + especie + " | Edad: " + edad);    
    }

    void cumplirAnios() {
        edad++; // Incrementa +1 a la edad actual

        System.out.println("¡Feliz cumpleaños, " + nombre + "! Ahora tienes " + edad + " años.");
    }
}

public class Ejercicio18 {
    
}
