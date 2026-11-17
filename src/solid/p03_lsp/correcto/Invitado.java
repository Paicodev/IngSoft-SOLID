package solid.p03_lsp.correcto;

public class Invitado implements Usuario {
    private final String nombre;

    public Invitado(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }
}
