// FORMA INCORRECTA: ServicioTurnos instancia directamente las clases concretas.
public class ServicioTurnos {
    private final MySQLRepositorio repo = new MySQLRepositorio();
    private final EmailNotificador notificador = new EmailNotificador();

    // Si queremos cambiar Email por WhatsApp, o usar un Mock en un test unitario,
    // estamos OBLIGADOS a modificar el código interno de ServicioTurnos:
    // private final WhatsAppNotificador notificador = new WhatsAppNotificador();

    public void crearTurno(String paciente) {
        repo.guardar(paciente);
        notificador.enviar("Turno confirmado para " + paciente);
    }
}
