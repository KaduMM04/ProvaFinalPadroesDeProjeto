package factory;

import models.Relatorio;
import models.RelatorioDiario;

public class RelatorioDiarioFactory extends RelatorioFactory{
    @Override
    public Relatorio criarRelatorio() {
       return new RelatorioDiario();
    }
}
