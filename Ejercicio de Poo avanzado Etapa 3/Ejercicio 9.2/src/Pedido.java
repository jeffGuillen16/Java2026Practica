public class Pedido {
    private int numero;
    private Cliente cliente;
    private DetallePedido[] detallePedidos;

    public Pedido(int numero, Cliente cliente, DetallePedido[] detallePedidos) {
        this.numero = numero;
        this.cliente = cliente;
        this.detallePedidos = detallePedidos;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DetallePedido[] getDetallePedidos() {
        return detallePedidos;
    }

    public double calcularTotal() {
        double total = 0;

        for (DetallePedido detalle : detallePedidos) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    public void mostrarDatos() {
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Documento: " + cliente.getDocumento());
        System.out.println("===== DETALLES =====");

        for (DetallePedido detalle : detallePedidos) {
            detalle.mostrarDatos();
            System.out.println("--------------------");
        }

        System.out.println("Total: $" + calcularTotal());
    }
}
