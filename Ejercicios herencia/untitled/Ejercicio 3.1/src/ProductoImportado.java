public class ProductoImportado extends Producto{
    private double impuestoImportacion;

    public ProductoImportado(String nombre , double precio , double impuestoImportacion) {
        super(nombre,precio);
        this.impuestoImportacion = impuestoImportacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre:" + getNombre());
        System.out.println("Precio:" + "$" + getPrecio());
        System.out.println("Impuesto de importación:" + "$"+ impuestoImportacion);

    }
}
