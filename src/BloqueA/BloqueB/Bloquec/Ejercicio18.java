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
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Firulais";
        miMascota.especie = "Perro";
        miMascota.edad = 3; // Edad inicial

        System.out.println("EDAD INICIAL:");
        miMascota.mostrarMascota();

        // Llega el cumpleaños de la mascota
        System.out.println("\n¡Es el cumpleaños de " + miMascota.nombre + "!");
        miMascota.cumplirAnios(); // Incrementa la edad y muestra el mensaje de cumpleaños
        System.out.println("EDAD DESPUÉS DEL CUMPLEAÑOS:");
        miMascota.mostrarMascota(); // Muestra la información actualizada de la mascota después del cumpleaños
    }
}
