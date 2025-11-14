public class AnaliseContextoRisco {
    private CalculadorRisco calculadorRisco;

    public void definirCalculadora(CalculadorRisco calculadorRisco) {
        this.calculadorRisco = calculadorRisco;
    }

    public double executarCalculo(double renda, double patrimonio, double dividas) {
        return calculadorRisco.calcularRisco(renda, patrimonio, dividas);
    }

}
