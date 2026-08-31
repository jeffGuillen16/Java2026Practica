public class Gerente extends Empleado {
   double bono;
    public Gerente(double sueldoBase ,double bono){
        super(sueldoBase);
        this.bono=bono;
    }
    @Override
    public double calcularSueldo(){
        return getSueldoBase()+bono;
    }
}
