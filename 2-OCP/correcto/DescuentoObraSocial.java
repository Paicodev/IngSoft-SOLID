public class DescuentoObraSocial implements Descuento {
    @Override
    public double aplicar(double monto) {
        return monto * 0.70;
    }
}
