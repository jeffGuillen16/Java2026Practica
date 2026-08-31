public class Proveedor implements Pagable {
    String nombre;
    double montoFactura;

    public Proveedor(String nombre, double montoFactura) {
        this.nombre = nombre;
        this.montoFactura = montoFactura;
    }

    @Override
    public double calcularPago(){
        return montoFactura;
    }
}
