import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TextoLimpioValidator implements ConstraintValidator<TextoLimpio, String> {

    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {

        if (valor == null) return true; // se maneja con @NotNull si quieres

        for (int i = 0; i < valor.length(); i++) {

            char c = valor.charAt(i);

            // permitir letras
            if (Character.isLetter(c)) continue;

            // permitir espacio
            if (Character.isSpaceChar(c)) continue;

            // cualquier otro carácter → inválido
            return false;
        }

        return true;
    }
}