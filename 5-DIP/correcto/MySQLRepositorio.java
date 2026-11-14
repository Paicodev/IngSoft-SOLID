public class MySQLRepositorio implements RepositorioTurnos {
    @Override
    public void guardar(String paciente) {
        System.out.println("[MySQL] Turno guardado para " + paciente);
    }
}
