//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marca = "Ford";
        auto.velocidad = 20;
        auto.cantPuertas = 5;
        System.out.println("Marca:" + auto.marca);
        System.out.println("Velocidad:" + auto.velocidad);
        System.out.println("Cantidad de puertas:" + auto.cantPuertas);
    }
}