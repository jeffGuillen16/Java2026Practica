public class DetallePedido {
    private Producto producto;
    private int cantidad;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public void mostrarDatos() {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio unitario: $" + producto.getPrecio());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + calcularSubtotal());
    }
}
