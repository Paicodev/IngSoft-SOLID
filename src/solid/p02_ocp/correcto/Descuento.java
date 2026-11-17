package solid.p02_ocp.correcto;

// FORMA CORRECTA: Abierto a extensión (nuevas clases), cerrado a modificación.
public interface Descuento {
    double aplicar(double monto);
}
