public class Main {

    public static void main(String[] args) throws Exception {

        Usuario u1 = new Usuario("123", "Juan");
        Usuario u2 = new Usuario("999", "Juan");

        ValidadorInmutable.validar(u1, u2);
    }
}
