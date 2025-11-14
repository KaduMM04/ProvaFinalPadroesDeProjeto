public class App {
    public static void main(String[] args) throws Exception {
        AnaliseContextoRisco contexto = new AnaliseContextoRisco();

    
        double renda = 8000;
        double patrimonio = 40000;
        double dividas = 7000;

       
        contexto.definirCalculadora(new ModeloAgressivo());
        System.out.println("Modelo Agressivo: " + contexto.executarCalculo(renda, patrimonio, dividas));


        contexto.definirCalculadora(new ModeloModerado());
        System.out.println("Modelo Moderado: " + contexto.executarCalculo(renda, patrimonio, dividas));

      
        contexto.definirCalculadora(new ModeloConservador());
        System.out.println("Modelo Conservador: " + contexto.executarCalculo(renda, patrimonio, dividas));
    }
}
