class Gato {
    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }
}

// MAL: método fuera de la clase
void maullar() {
    System.out.println("Miau");
}