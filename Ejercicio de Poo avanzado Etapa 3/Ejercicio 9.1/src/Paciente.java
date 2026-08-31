public class Paciente {
    private String nombre;
    private String documento;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento(){
        return documento;
    }

    public Paciente (String nombre , String documento , int edad ){
        this.documento=documento;
        this.edad=edad;
        this.nombre=nombre;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Paciente datos:");
        System.out.println("Edad:"+ getEdad() );
        System.out.println("Docuento: " + getDocumento());
    }
}
