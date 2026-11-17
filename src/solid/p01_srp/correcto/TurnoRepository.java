package solid.p01_srp.correcto;

// Responsabilidad 2: Persistir el turno.
public class TurnoRepository {
    public void guardar(Turno turno) {
        System.out.println("[BD] Guardando turno de " + turno.getPaciente() + " (" + turno.getFecha() + ")");
    }
}
