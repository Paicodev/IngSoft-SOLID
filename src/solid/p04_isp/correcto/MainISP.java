package solid.p04_isp.correcto;

public class MainISP {
    public static void main(String[] args) {
        GestionTurnos recepcion = new Recepcionista();
        AtencionMedica medico = new Medico();

        recepcion.agendarTurno("Ana");
        medico.diagnosticar("Ana");

        // Si aparece un Enfermero que aplica vacunas, creamos una interfaz nueva
        // AtencionEnfermeria sin tocar Recepcionista ni Medico:
        // AtencionEnfermeria enfermero = paciente -> System.out.println("Vacuna
        // aplicada a " + paciente);
        // enfermero.aplicarVacuna("Ana");
    }
}
