public class Recepcionista implements GestionTurnos {
    @Override
    public void agendarTurno(String paciente) {
        System.out.println("Recepción agenda turno para " + paciente);
    }
}
