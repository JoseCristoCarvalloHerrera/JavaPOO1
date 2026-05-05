import java.lang.reflect.Field;

public class ValidadorInmutable {

    public static void validar(Object obj1, Object obj2) throws Exception {

        Class<?> clase = obj1.getClass();

        Field[] campos = clase.getDeclaredFields();

        for (Field campo : campos) {

            if (campo.isAnnotationPresent(Inmutable.class)) {

                campo.setAccessible(true);

                Object valor1 = campo.get(obj1);
                Object valor2 = campo.get(obj2);

                if (valor1 != null && !valor1.equals(valor2)) {
                    throw new RuntimeException(
                            "El campo '" + campo.getName() + "' es inmutable y fue modificado"
                    );
                }
            }
        }
    }
}