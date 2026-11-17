package solid.p04_isp.incorrecto;

public class MainISP {
    public static void main(String[] args) {
        GestionClinica r = new Recepcionista();
        r.agendarTurno("Ana");
        r.diagnosticar("Ana");
    }
}
