import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = ListaValidaValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ListaValida {

    String message() default "Lista inválida";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}