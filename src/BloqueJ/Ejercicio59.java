class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave, boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    void activar() {
        activo = true;
        System.out.println(" Acción: El usuario '" + nombreUsuario + "' ha sido ACTIVADO.");
    }

    void desactivar() {
        activo = false;
        System.out.println(" Acción: El usuario '" + nombreUsuario + "' ha sido DESACTIVADO.");
    }

    void mostrarEstado() {
        System.out.println("Usuario: " + nombreUsuario + " | ¿Activo?: " + activo);
    }
}

public class Ejercicio59 {
    public static void main(String[] args) {
    }
}