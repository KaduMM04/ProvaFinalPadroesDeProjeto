public class ModeloConservador implements CalculadorRisco{
    @Override
    public double calcularRisco(double renda, double patrimonio, double dividas) {
        return (dividas * 0.9) - (renda * 0.7);
    }
}
