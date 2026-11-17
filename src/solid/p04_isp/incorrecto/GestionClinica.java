package solid.p04_isp.incorrecto;

// FORMA INCORRECTA: Interfaz "gorda" que mezcla roles distintos.
public interface GestionClinica {
    void agendarTurno(String paciente);
    void diagnosticar(String paciente);
}
