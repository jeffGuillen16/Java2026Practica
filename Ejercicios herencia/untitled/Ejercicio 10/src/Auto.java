public class Auto extends Vehiculo implements Asegurable {

    public Auto(String marca, String modelo, double velocidad) {
        super(marca, modelo, velocidad);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: Auto");
    }

    @Override
    public double calcularSeguro() {
        return getVelocidad() * 1000;
    }
}
