public class Main {
    public static void main(String[] args) {
        enviarNotificacion(new Email());
        enviarNotificacion(new Sms());
        enviarNotificacion(new WhatsApp());
    }
//No puedes instanciar una interfaz, es decir, no puedes hacerlo
// Lo que puedes hacer es instancias una clase que implemente la interfaz
//Notificion es tipo de dato referencia
//tipo de dato Referencia Notificacion que es una interfaz no se puede instanciar pero si puede instanciar sus clases
    public static void enviarNotificacion(Notificacion notificacion) {
        notificacion.notificar();
    }
}
