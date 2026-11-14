public class DescuentoJubilado implements Descuento {
    @Override
    public double aplicar(double monto) {
        return monto * 0.80;
    }
}
