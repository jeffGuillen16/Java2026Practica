public class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void detener() {
        System.out.println("El auto se esta deteniendo...");
    }

    @Override
    public void arrancar() {
        System.out.println("El auto esta arrancando...");
    }
}
