//CODIGO ERROR 
// class Billetera {
    // int dinero;
    // public Billetera(int dineroInicial) {
       // this.dinero = dineroInicial;
    //}
    //void agregarDinero(int cantidad) {
      //  int dinero = this.dinero + cantidad;
    //}

    //void mostrarSaldo() {
      //  System.out.println("Saldo actual: $" + dinero);
    //}
//}

//public class Ejercicio48 {
  //  public static void main(String[] args) {
    //    Billetera miBilletera = new Billetera(100);
        
      //  miBilletera.agregarDinero(50);
        
        // miBilletera.mostrarSaldo();
    // }
// }
// CODIGO CORREGIDO:
class Billetera {
    int dinero;

    public Billetera(int dineroInicial) {
        this.dinero = dineroInicial;
    }

    void agregarDinero(int cantidad) {
        this.dinero = this.dinero + cantidad;
    }

    void mostrarSaldo() {
        System.out.println("Saldo actual: $" + dinero);
    }
}

public class Ejercicio48 {
    public static void main(String[] args) {
        Billetera miBilletera = new Billetera(100);
        
        miBilletera.agregarDinero(50);
        
        miBilletera.mostrarSaldo();
    }
}