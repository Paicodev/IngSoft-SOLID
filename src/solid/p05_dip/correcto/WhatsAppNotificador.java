package solid.p05_dip.correcto;

public class WhatsAppNotificador implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[WhatsApp] " + mensaje);
    }
}
