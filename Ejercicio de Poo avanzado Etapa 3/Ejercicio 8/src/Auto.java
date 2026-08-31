public class Auto {
    Motor motor;
    public Auto(Motor motor) {
        this.motor = motor;
    }
    public void arrancar (){
        motor.encender();
    }
}
