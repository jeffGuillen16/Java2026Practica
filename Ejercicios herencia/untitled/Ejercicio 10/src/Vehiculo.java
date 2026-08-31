public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidad;

    public Vehiculo(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: Vehículo");
    }
}
