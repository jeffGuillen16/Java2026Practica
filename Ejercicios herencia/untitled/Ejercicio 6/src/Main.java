//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("jeferson",1500);
        Proveedor proveedor = new Proveedor("juli",3000);
        System.out.println("Sueldo de Empleado:" + empleado.calcularPago());
        System.out.println("Calcular facturación: " + proveedor.calcularPago());

    }
}