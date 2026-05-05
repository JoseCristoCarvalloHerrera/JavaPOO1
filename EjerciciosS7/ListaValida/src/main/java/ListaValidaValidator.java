import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;
import java.util.stream.Collectors;

public class ListaValidaValidator implements ConstraintValidator<ListaValida, List<?>> {

    @Override
    public boolean isValid(List<?> lista, ConstraintValidatorContext context) {

        if (lista == null || lista.isEmpty()) {
            return false;
        }

        //  Contiene null
        if (lista.stream().anyMatch(e -> e == null)) {
            return false;
        }

        //  Tiene duplicados
        long cantidadOriginal = lista.size();
        long cantidadUnicos = lista.stream().distinct().count();

        if (cantidadOriginal != cantidadUnicos) {
            return false;
        }

        return true;
    }
}