import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}