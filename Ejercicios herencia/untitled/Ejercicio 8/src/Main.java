//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmpleadoNormal empleadoNormal = new EmpleadoNormal(1500);
        Gerente gerente = new Gerente(3000,200);

        System.out.println("Sueldo base de empleado Normal: "+ empleadoNormal.calcularSueldo() );
        System.out.println("Sueldo de Gerente : " + gerente.calcularSueldo());
    }
}