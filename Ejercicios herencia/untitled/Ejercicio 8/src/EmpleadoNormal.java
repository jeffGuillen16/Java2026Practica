public class EmpleadoNormal extends Empleado {

    public EmpleadoNormal(double sueldoBase){
        super(sueldoBase);
    }

    @Override
    public double calcularSueldo(){
        return getSueldoBase();
    }
}
