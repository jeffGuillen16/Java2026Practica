public class Tienda {
    private String nombre;
    private String direccion;
    private Vendedor[] vendedores;
    private Producto[] productos;

    public Tienda(String nombre, String direccion, Vendedor[] vendedores, Producto[] productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.vendedores = vendedores;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void mostrarDatos() {
        System.out.println("===== TIENDA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);

        System.out.println("===== VENDEDORES =====");
        for (Vendedor vendedor : vendedores) {
            System.out.println("Nombre: " + vendedor.getNombre());
            System.out.println("Documento: " + vendedor.getDocumento());
            vendedor.mostrarRol();
            System.out.println("--------------------");
        }

        System.out.println("===== PRODUCTOS =====");
        for (Producto producto : productos) {
            producto.mostrarDatos();
            System.out.println("--------------------");
        }
    }
}
