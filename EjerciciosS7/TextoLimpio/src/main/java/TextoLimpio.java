import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = TextoLimpioValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TextoLimpio {

    String message() default "Texto inválido: solo letras y espacios";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}