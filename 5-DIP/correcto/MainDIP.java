public class MainDIP {
    public static void main(String[] args) {
        ServicioTurnos servicio = new ServicioTurnos(
                new MySQLRepositorio(),
                new WhatsAppNotificador());
        servicio.crearTurno("Ana");

        // Si queremos cambiar a otro notificador (ej. SMS) o usar un Mock en tests,
        // solo inyectamos otra implementación SIN tocar ServicioTurnos.java:
        // ServicioTurnos servicioTest = new ServicioTurnos(
        // p -> System.out.println("[Mock BD] " + p),
        // m -> System.out.println("[SMS] " + m)
        // );
        // servicioTest.crearTurno("Luis");
    }
}
