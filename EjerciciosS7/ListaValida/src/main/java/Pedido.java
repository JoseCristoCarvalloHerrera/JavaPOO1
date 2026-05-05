import java.util.List;

public class Pedido {

    @ListaValida
    private List<String> productos;

    public Pedido(List<String> productos) {
        this.productos = productos;
    }

    public List<String> getProductos() {
        return productos;
    }
}