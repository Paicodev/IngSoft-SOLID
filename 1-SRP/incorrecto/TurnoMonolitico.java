// FORMA INCORRECTA: Todo acoplado en una sola clase.
// Tiene 3 razones distintas para cambiar:
// 1) Reglas del turno, 2) Persistencia en BD, 3) Envío de notificaciones.
public class TurnoMonolitico {
    private String paciente;
    private String fecha;

    public TurnoMonolitico(String paciente, String fecha) {
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public void confirmarTurno() {
        System.out.println("Confirmando turno de " + paciente + " para " + fecha);
        guardarEnBaseDeDatos();
        enviarEmailConfirmacion();
    }

    private void guardarEnBaseDeDatos() {
        System.out.println("[BD] INSERT INTO turnos VALUES ('" + paciente + "', '" + fecha + "')");
    }

    private void enviarEmailConfirmacion() {
        System.out.println("[Email] Enviando confirmación a " + paciente);
    }

    // Si piden enviar también por WhatsApp o cambiar de BD, hay que abrir
    // y modificar ESTA MISMA CLASE, arriesgando romper confirmarTurno():
    // private void enviarWhatsAppConfirmacion() {
    // System.out.println("[WhatsApp] Enviando confirmación a " + paciente);
    // }

    public static void main(String[] args) {
        TurnoMonolitico turno = new TurnoMonolitico("Ana", "20/11 10:00");
        turno.confirmarTurno();
    }
}
