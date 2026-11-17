package solid.p01_srp.correcto;

// Responsabilidad 3: Notificar al paciente.
public class NotificadorEmail {
    public void enviarConfirmacion(Turno turno) {
        System.out.println("[Email] Turno confirmado para " + turno.getPaciente() + " el " + turno.getFecha());
    }
}
