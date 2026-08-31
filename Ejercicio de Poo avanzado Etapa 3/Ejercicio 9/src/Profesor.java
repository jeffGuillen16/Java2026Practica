public class Profesor {
    private String nombre;
    private int edad;
    private int idProfesor;

    public Profesor(String nombre, int edad, int idProfesor) {
        this.nombre = nombre;
        this.edad = edad;
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void mostrarDatos() {
        System.out.println("Profesor: " + nombre);
        System.out.println("ID: " + idProfesor);
        System.out.println("Edad: " + edad);
    }
}
