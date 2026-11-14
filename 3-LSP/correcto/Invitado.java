public class Invitado implements Usuario {
    private final String nombre;

    public Invitado(String nombre) { this.nombre = nombre; }

    @Override
    public String getNombre() { return nombre; }
}
