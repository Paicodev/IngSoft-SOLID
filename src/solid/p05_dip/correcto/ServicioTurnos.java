package solid.p05_dip.correcto;

public class ServicioTurnos {
    private final RepositorioTurnos repo;
    private final Notificador notificador;

    public ServicioTurnos(RepositorioTurnos repo, Notificador notificador) {
        this.repo = repo;
        this.notificador = notificador;
    }

    public void crearTurno(String paciente) {
        repo.guardar(paciente);
        notificador.enviar("Turno confirmado para " + paciente);
    }
}
