public class Recepcionista implements GestionClinica {
    @Override
    public void agendarTurno(String paciente) {
        System.out.println("Recepción agenda turno para " + paciente);
    }

    @Override
    public void diagnosticar(String paciente) {
        throw new UnsupportedOperationException("Un recepcionista no puede diagnosticar.");
    }

    // Si agregamos un método nuevo a GestionClinica (ej. aplicarVacuna()),
    // obligamos a Recepcionista (y a todas las clases existentes) a implementarlo
    // aunque no lo usen.
}
