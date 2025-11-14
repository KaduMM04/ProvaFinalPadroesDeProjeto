public class ModeloModerado implements CalculadorRisco {
    @Override
    public double calcularRisco(double renda, double patrimonio, double dividas) {
        return (dividas * 1.2) - (renda * 0.7) + (patrimonio * 0.1);
    }

}
