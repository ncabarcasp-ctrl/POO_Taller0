// CODIGO ERRONEO /Corrige un ejemplo donde un objeto intenta acceder a atributos de otro sin referencia adecuada.

class Jugador {
    String nombre;
    int vida;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    void atacar() {
        enemigo.vida = enemigo.vida - 10;
        System.out.println(nombre + " atacó al enemigo. Le quedan " + enemigo.vida + " puntos de vida.");
    }
}

public class Ejercicio49 {
    public static void main(String[] args) {
        Jugador heroe = new Jugador("Link", 100);
        Jugador enemigo = new Jugador("Ganon", 100);
        
        heroe.atacar();
    }
}
