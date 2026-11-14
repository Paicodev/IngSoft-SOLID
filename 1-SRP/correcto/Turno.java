// Responsabilidad 1: Representar los datos del turno.
public class Turno {
    private final String paciente;
    private final String fecha;

    public Turno(String paciente, String fecha) {
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public String getPaciente() { return paciente; }
    public String getFecha() { return fecha; }
}
