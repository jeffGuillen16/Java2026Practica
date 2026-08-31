public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("Codigo:" + getCodigo());
        System.out.println("Nombre:" + getNombre());
        System.out.println("Precio:" + getPrecio());
    }

}
