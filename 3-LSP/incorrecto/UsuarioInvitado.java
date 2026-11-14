// FORMA INCORRECTA: Hereda de Usuario pero rompe su contrato al lanzar excepción.
public class UsuarioInvitado extends Usuario {
    @Override
    public void agendarTurno() {
        throw new UnsupportedOperationException("Un invitado no puede agendar turnos.");
    }
}
