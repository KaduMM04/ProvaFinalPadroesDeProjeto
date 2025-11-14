public class ModeloAgressivo implements CalculadorRisco {
    @Override
    public double calcularRisco(double renda, double patrimonio, double dividas) {
        return (dividas * 1.8) - (renda * 0.5) + (patrimonio * 0.2);
    }
}
