// CODIGO INCORRECTO
//class Reloj {
   // String marca;
    //public Reloj(String marca) {
        //this.marca = marca;
    //}
    //void darHora() {
        //System.out.println("El reloj " + marca + " marca las 12:00");
    //}
//}

//public class Ejercicio47 {
    //public static void main(String[] args) {
        //Reloj miReloj;
        
        //miReloj.darHora();
    //}
//}

class Reloj {
    String marca;

    public Reloj(String marca) {
        this.marca = marca;
    }

    void darHora() {
        System.out.println("El reloj " + marca + " marca las 12:00");
    }
}

public class Ejercicio47 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj("Casio");
        
        miReloj.darHora();
    }
}