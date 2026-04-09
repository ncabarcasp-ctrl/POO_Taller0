// VERSION INCORRECTA
//class {
    //String nombre;

    //public Gato(String nombre) {
    //    this.nombre = nombre;
    //}
//}
// VERSION CORREGIDA

class Gato {
    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }
    
    void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}


public class Ejercicio46 {
    public static void main(String[] args) {
        Gato g1 = new Gato("Michi");
        g1.maullar();
    }
}