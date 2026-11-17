package solid.p02_ocp.correcto;

public class MainOCP {
    public static void main(String[] args) {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        System.out.println("Jubilado: $" + calc.calcular(1000, new DescuentoJubilado()));
        System.out.println("Obra Social: $" + calc.calcular(1000, new DescuentoObraSocial()));

        // Para agregar descuento ESTUDIANTE, creamos DescuentoEstudiante.java
        // SIN modificar CalculadoraDescuento.java:
        // System.out.println("Estudiante: $" + calc.calcular(1000, monto -> monto *
        // 0.85));
    }
}
