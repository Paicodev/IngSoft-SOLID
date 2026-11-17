package solid.p01_srp.correcto;

public class MainSRP {
    public static void main(String[] args) {
        Turno turno = new Turno("Ana", "20/11 10:00");
        TurnoRepository repo = new TurnoRepository();
        NotificadorEmail notificador = new NotificadorEmail();

        repo.guardar(turno);
        notificador.enviarConfirmacion(turno);

        // Si piden enviar por WhatsApp, creamos una clase nueva NotificadorWhatsApp
        // SIN tocar Turno, TurnoRepository ni NotificadorEmail:
        // NotificadorWhatsApp whatsapp = new NotificadorWhatsApp();
        // whatsapp.enviarConfirmacion(turno);
    }
}
