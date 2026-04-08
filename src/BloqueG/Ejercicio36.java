class Puerta {
    String material;
    Boolean abierta;

    public Puerta(String material) {
        this.material = material;
        this.abierta = false;
    }
void abrir(){
    abierta = true;
}

void cerrar() {
    abierta = false;
}
void mostrarEstado() {
    if (abierta) {
        System.out.println("La puera de " + material + " esta ABIERTA");
    } else {
        System.out.println("La puerta de" + material + "esta CERRADA");
    
    }
 }

}

public class Ejercicio36 {
    public static void main(String[] args) {
        Puerta miPuerta = new Puerta("Madera");
        
        miPuerta.mostrarEstado(); 
        
        miPuerta.abrir();
        miPuerta.mostrarEstado();
        
        miPuerta.cerrar();
        miPuerta.mostrarEstado();
    }
}