public class Moto extends Vehiculo implements Asegurable {

    public Moto(String marca, String modelo, double velocidad) {
        super(marca, modelo, velocidad);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Moto");
    }

    @Override
    public double calcularSeguro() {
        return getVelocidad() * 500;
    }
}
