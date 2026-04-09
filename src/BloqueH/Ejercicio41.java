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
        
}

}