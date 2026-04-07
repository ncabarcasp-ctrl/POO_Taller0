// 1. RESPUESTA DEL EJERCICIO 19: ¿Por qué Estudiante es clase y est1 es un objeto?
// 'Estudiante' es una CLASE porque es una plantilla o molde que define qué atributos (nombre, código, etc.) y métodos tendrá un estudiante.
// pero no representa a un estudiante / persona real ni ocupa espscio con datos TODAVIA.

class Estudiante {
    String nombre;
    int codigo;
}

public class Ejercicio19 {
    public static void main(String[] args) {
        

// 2. ''est1'' es un OBJETO porque es la MATERIALIZACIÓN de ese molde/plantilla llamada clase.
// 'est1' es un estudiante real y especifico que existe en la meoria de la computadora, al cual le podemos asignar valores a sus atributos (nombre, código, etc. EJEMPLO: nombre = "Natalia", código = "12345").

Estudiante est1 = new Estudiante(); 
        
        est1.nombre = "Natalia";
        est1.codigo = 12345;
        
        System.out.println("El objeto est1 se llama: " + est1.nombre);
    }
}