public class Main {
    public static void main(String[] args) {
        //TIPO DE REFERENCIA CLASE ABASTRACTA PERO NO SE PUEDE INSTANCIAR SOLO SUS CLASES
        Vehiculo[] vehiculos = {
                new Auto("Ford", "Focus"),
                new Moto("Honda", "CB 190"),
                new Camion("Volvo", "FH")
        };

        for (Vehiculo v : vehiculos) {
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            v.arrancar();
            v.detener();
            System.out.println("--------------------");
        }
    }
}
