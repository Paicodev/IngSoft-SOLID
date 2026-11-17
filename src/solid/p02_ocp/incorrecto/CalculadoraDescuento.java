package solid.p02_ocp.incorrecto;

// FORMA INCORRECTA: Cada vez que aparece un nuevo tipo de paciente
// hay que modificar esta clase agregando otro else-if (viola Abierto/Cerrado).
public class CalculadoraDescuento {
    public double calcular(String tipoPaciente, double monto) {
        if (tipoPaciente.equals("JUBILADO")) {
            return monto * 0.80; // 20% descuento
        } else if (tipoPaciente.equals("OBRA_SOCIAL")) {
            return monto * 0.70; // 30% descuento
        }
        // Si aparece un nuevo descuento (ej. ESTUDIANTE 15%), estamos OBLIGADOS
        // a modificar esta clase existente agregando otro else-if:
        // else if (tipoPaciente.equals("ESTUDIANTE")) {
        // return monto * 0.85;
        // }
        return monto;
    }

    public static void main(String[] args) {
        CalculadoraDescuento calc = new CalculadoraDescuento();
        System.out.println("Total jubilado: $" + calc.calcular("JUBILADO", 1000));
    }
}
