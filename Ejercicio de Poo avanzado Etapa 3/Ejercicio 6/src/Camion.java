public class Camion extends Vehiculo {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("El camion esta arrancando...");
    }
}
