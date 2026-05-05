import jakarta.validation.*;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Persona p = new Persona("Juan123"); // inválido

        Set<ConstraintViolation<Persona>> errores = validator.validate(p);

        for (ConstraintViolation<Persona> error : errores) {
            System.out.println(error.getMessage());
        }
    }
}