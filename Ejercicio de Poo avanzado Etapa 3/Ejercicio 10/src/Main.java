public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(2, "Aceite", 2000);
        Producto producto2 = new Producto(2, "Arroz", 3000);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println("¿Los productos son iguales? " + producto1.equals(producto2));
        System.out.println("HashCode del producto 1: " + producto1.hashCode());
        System.out.println("HashCode del producto 2: " + producto2.hashCode());
    }
}
