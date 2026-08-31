public class Medico {
    private String nombre;
    private int matricula;
    private String especialidad;

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public Medico (int matricula , String nombre , String especialidad){
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.matricula=matricula;
    }

    public void mostrarDato(){
        System.out.println("Datos del Medico:");
        System.out.println("Nombre : " + getNombre() );
        System.out.println("Matricula :" + getMatricula());
        System.out.println("Especialidad : " + getEspecialidad());
    }
}
