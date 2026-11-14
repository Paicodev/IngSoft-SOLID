public class MainLSP {
    public static void procesarAgenda(UsuarioAgendador usuario) {
        usuario.agendarTurno();
    }

    public static void main(String[] args) {
        UsuarioAgendador paciente = new Paciente("Ana");
        Usuario invitado = new Invitado("Visitante");

        procesarAgenda(paciente);
        System.out.println("Usuario conectado: " + invitado.getNombre());

        // Si agregamos un Auditor que solo consulta, implementa Usuario (no
        // UsuarioAgendador).
        // Ningún método que espere UsuarioAgendador puede fallar con un Auditor:
        // Usuario auditor = () -> "Auditor Externo";
        // System.out.println("Usuario conectado: " + auditor.getNombre());
    }
}
