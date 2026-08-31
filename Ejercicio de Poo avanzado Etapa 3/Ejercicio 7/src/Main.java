//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Volador [] volador = {
                new Avion(),
                new Drone(),
                new Pajaro()
        };
        for (Volador v : volador) {
                v.volar();
        }
    }

}