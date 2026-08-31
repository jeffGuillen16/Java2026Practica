import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] ventas = {25000, 80000, 45000, 120000, 60000};
        double[] ventasPrecioFinal = new double[ventas.length];
        int totalVendido=0;
        for (int i = 0; i < ventas.length; i++) {
            ventasPrecioFinal[i] = calcularPrecioFinal(ventas[i]);
            totalVendido += ventasPrecioFinal[i];
            System.out.println("Venta Original : " + ventas[i]);
            System.out.println("Venta Original : " + ventasPrecioFinal[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println(totalVendido);
    }

    public static double calcularPrecioFinal(double precio) {
        double precioFinal;
        if (precio > 50000) {
            precioFinal = precio - (precio * 0.10);
        } else {
            precioFinal = precio;
        }
        return precioFinal;
    }
}