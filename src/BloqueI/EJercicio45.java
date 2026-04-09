class Gato {
    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

public class Ejercicio45 {
    public static void main(String[] args) {
        Gato miGato = new Gato("Michi");
        
        miGato.maullar();
    }
}