public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Triangulo(4, 4),
                new Rectangulo(4, 4),
                new Circulo(2)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
}
