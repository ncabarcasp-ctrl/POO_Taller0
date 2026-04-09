class Empleado {
    String nombre;
    String puesto;
    double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario; 
    }

    void mostrarDetalles(){
        System.out.println("Empleado: " + nombre + " | Puesto: " + puesto + " | Salario: $" + salario);
    }

}

public class Ejercicio41 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Valeria Garces", "Administradora", 3500.0);
        Empleado emp2 = new Empleado("Isabelle Cabrales", "Ingeniera", 9800.0);


        emp1.mostrarDetalles();
        emp2.mostrarDetalles();


        System.out.println("\n--- ¿POR QUÉ CLASES EN LUGAR DE VARIABLES SUELTAS? ---");
System.out.println("Modelar con clases es mejor porque permite encapsular datos y comportamientos");
System.out.println("relacionados dentro de una sola entidad, haciendo el código más organizado y reutilizable.");
System.out.println("Si usáramos variables sueltas como nombre1, puesto1 o salario1, el código se volvería");
System.out.println("difícil de mantener y propenso a errores. En cambio, con objetos podemos representar");
System.out.println("empleados reales, escalar el sistema fácilmente y trabajar de forma más estructurada.");
    }

}