public class LoginValidator {
    public static boolean validate(String password) {

        boolean tieneMayuscula = password.matches(".*[A-Z]*.");
        boolean tieneNumero = password.matches(".*[0-9]*.");
        boolean tieneCaracter = password.matches(".*[@$#!%*?&._-].*");


        if (tieneMayuscula & tieneNumero & tieneCaracter) {
            return true;

        } else {
            return false;
        }


    }
}
