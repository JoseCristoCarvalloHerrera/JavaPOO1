import jakarta.validation.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        List<String> lista = Arrays.asList("Pan", "Leche","Pan");

        Pedido pedido = new Pedido(lista);

        Set<ConstraintViolation<Pedido>> errores = validator.validate(pedido);

        for (ConstraintViolation<Pedido> error : errores) {
            System.out.println(error.getMessage());
        }
    }
}