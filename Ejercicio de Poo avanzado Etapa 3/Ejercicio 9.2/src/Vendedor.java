public class Vendedor extends Persona{
    public Vendedor(String nombre , int documento){
        super(nombre,documento);
    }

    @Override
    public void mostrarRol() {
        System.out.println("soy vendedor");
    }
}
