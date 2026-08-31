public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford", "Focus", 120);
        Moto moto = new Moto("Honda", "CB 190", 100);

        auto.mostrarTipo();
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Velocidad: " + auto.getVelocidad());
        System.out.println("Costo del seguro: $" + auto.calcularSeguro());

        System.out.println("--------------------");

        moto.mostrarTipo();
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Velocidad: " + moto.getVelocidad());
        System.out.println("Costo del seguro: $" + moto.calcularSeguro());
    }
}
