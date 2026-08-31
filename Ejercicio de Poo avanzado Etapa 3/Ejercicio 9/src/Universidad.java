public class Universidad {
    private Estudiante[] estudiantes;
    private Profesor[] profesores;
    private int cantAulas;
    private String direccion;

    public Universidad(Estudiante[] estudiantes, Profesor[] profesores,
                       int cantAulas, String direccion) {
        this.estudiantes = estudiantes;
        this.profesores = profesores;
        this.cantAulas = cantAulas;
        this.direccion = direccion;
    }

    public void mostrarInformacion() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de aulas: " + cantAulas);

        System.out.println("===== ESTUDIANTES =====");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarDatos();
            System.out.println("--------------------");
        }

        System.out.println("===== PROFESORES =====");
        for (Profesor profesor : profesores) {
            profesor.mostrarDatos();
            System.out.println("--------------------");
        }
    }
}

