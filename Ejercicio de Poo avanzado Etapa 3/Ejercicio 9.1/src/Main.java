public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico(1001, "Laura", "Cardiología");
        Medico medico2 = new Medico(1002, "Martín", "Pediatría");

        Paciente paciente1 = new Paciente("Ana", "40111222", 25);
        Paciente paciente2 = new Paciente("Carlos", "35999888", 41);

        Medico[] medicos = {medico1, medico2};
        Paciente[] pacientes = {paciente1, paciente2};

        Hospital hospital = new Hospital(
                "Hospital Central",
                "Avenida Principal 123",
                80,
                medicos,
                pacientes
        );

        hospital.mostrarDatos();

        System.out.println("===== MÉDICOS =====");
        for (Medico medico : medicos) {
            medico.mostrarDato();
            System.out.println("--------------------");
        }

        System.out.println("===== PACIENTES =====");
        for (Paciente paciente : pacientes) {
            paciente.mostrarDatos();
            System.out.println("--------------------");
        }
    }
}
