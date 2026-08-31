public class Empleado implements Pagable{
    String nombre;
    double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public double calcularPago(){
        return sueldo;
    }
}
