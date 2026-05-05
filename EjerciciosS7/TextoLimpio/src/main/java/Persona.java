import jakarta.validation.constraints.*;

public class Persona {

    @TextoLimpio
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}