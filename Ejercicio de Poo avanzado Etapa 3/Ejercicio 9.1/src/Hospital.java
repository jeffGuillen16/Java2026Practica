public class Hospital {
    private String nombre;
    private String direccion;
    private int cantHabitaciones;
    private Medico[] medicos;
    private Paciente[] pacientes;

    public Hospital(String nombre, String direccion, int cantHabitaciones, Medico[] medicos, Paciente[] pacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.medicos = medicos;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void mostrarDatos(){

        System.out.println("===== HOSPITAL =====");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Cantidad de habitaciones: " + getCantHabitaciones());
    }
}

