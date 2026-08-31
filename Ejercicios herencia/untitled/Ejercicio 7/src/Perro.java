public class Perro extends Animal implements Entrenable {
    @Override
    public void comer(){
        System.out.println("comiendo comida de perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("uau aua uaua");
    }

    @Override
    public void entrenar(){
        System.out.println("perro entrenando");
    }
}
