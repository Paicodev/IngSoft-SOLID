package solid.p04_isp.correcto;

public class Medico implements AtencionMedica {
    @Override
    public void diagnosticar(String paciente) {
        System.out.println("Médico registra diagnóstico para " + paciente);
    }
}
