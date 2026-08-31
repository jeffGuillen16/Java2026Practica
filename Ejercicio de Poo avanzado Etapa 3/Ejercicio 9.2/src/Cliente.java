public class Cliente extends Persona {
    public Cliente(String nombre, int documento) {
        super(nombre, documento);
    }

    @Override
    public void mostrarRol() {
        System.out.println("soy cliente");
    }
}
