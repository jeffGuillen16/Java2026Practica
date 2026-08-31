public class Estudiante {
    private String nombre;
    private int idAlumno;
    private int nota;

    public Estudiante(String nombre, int idAlumno, int nota) {
        this.nombre = nombre;
        this.idAlumno = idAlumno;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getNota() {
        return nota;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("ID: " + idAlumno);
        System.out.println("Nota: " + nota);
    }
}
