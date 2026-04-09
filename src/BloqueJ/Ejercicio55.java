//Ejercicio 55: Crea una clase Reloj con hora, minuto y segundo. Agrega método mostrarHora.

class Reloj {
    int hora;
    int minuto;
    int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void mostrarHora() {
        System.out.println("La hora exacta es: " + hora + "h " + minuto + "m " + segundo + "s");
    }
}

public class Ejercicio55 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj(14, 30, 45);
        
        miReloj.mostrarHora();
    }
}
