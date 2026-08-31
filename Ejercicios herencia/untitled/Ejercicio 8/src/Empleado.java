public class Empleado {
    private String nombre;
    private double sueldoBase;

    public Empleado(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double calcularSueldo(){
        return sueldoBase;
    }
}
