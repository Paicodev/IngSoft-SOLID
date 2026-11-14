public class Paciente implements UsuarioAgendador {
    private final String nombre;

    public Paciente(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void agendarTurno() {
        System.out.println(nombre + " agendó un turno.");
    }
}
