class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
}

public class Ejercicio9 {
    public static void main(String[] args)
    {
        Mascota mascota = new Mascota(); 
        mascota.nombre = "Firulais";
        mascota.especie = "Perro";
        mascota.edad = 3;
        mascota.mostrarMascota();

        mascota.edad = 5;
        mascota.mostrarMascota();

        mascota.edad = 2;
        mascota.mostrarMascota();
    }
}