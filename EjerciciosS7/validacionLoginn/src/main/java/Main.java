public class Main {
    public static void main(String[] args) {
        LoginRequest login = new LoginRequest("jose","123$hola");
        boolean esValido = LoginValidator.validate(login.getPassword());

        if(esValido){
            System.out.println("Contraseña Valida");



        }
        else{
            System.out.println("contraseña invalida");
        }
    }
}
