public class MainLSP {
    public static void main(String[] args) {
        Usuario u = new UsuarioInvitado();
        u.agendarTurno();

        // Si agregamos otro usuario de solo lectura (ej. UsuarioAuditor extends
        // Usuario),
        // también explotará o requerirá 'if (u instanceof UsuarioInvitado)' en todos
        // lados.
    }
}
