public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 1, 9);
        Estudiante estudiante2 = new Estudiante("Luis", 2, 8);

        Profesor profesor1 = new Profesor("Marta", 42, 101);
        Profesor profesor2 = new Profesor("Carlos", 38, 102);

        Estudiante[] estudiantes = {estudiante1, estudiante2};
        Profesor[] profesores = {profesor1, profesor2};

        Universidad universidad = new Universidad(
                estudiantes,
                profesores,
                20,
                "Avenida Principal 123"
        );

        universidad.mostrarInformacion();
    }
}
