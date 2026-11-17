package solid.p02_ocp.correcto;

// Esta clase no se modifica cuando agregamos nuevos descuentos.
public class CalculadoraDescuento {
    public double calcular(double monto, Descuento descuento) {
        return descuento.aplicar(monto);
    }
}
