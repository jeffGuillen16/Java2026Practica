public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001", "Notebook", 1200000);
        Producto producto2 = new Producto("P002", "Mouse", 25000);
        Producto[] productos = {producto1, producto2};

        Vendedor vendedor1 = new Vendedor("Laura", 30111222);
        Vendedor vendedor2 = new Vendedor("Martín", 28999888);
        Vendedor[] vendedores = {vendedor1, vendedor2};

        Tienda tienda = new Tienda(
                "Tienda Central",
                "Avenida Principal 123",
                vendedores,
                productos
        );

        Cliente cliente = new Cliente("Ana", 40123456);

        DetallePedido detalle1 = new DetallePedido(producto1, 1);
        DetallePedido detalle2 = new DetallePedido(producto2, 2);
        DetallePedido[] detalles = {detalle1, detalle2};

        Pedido pedido = new Pedido(1, cliente, detalles);

        tienda.mostrarDatos();

        System.out.println("===== CLIENTE =====");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Documento: " + cliente.getDocumento());
        cliente.mostrarRol();

        System.out.println("===== PEDIDO =====");
        pedido.mostrarDatos();
    }
}
