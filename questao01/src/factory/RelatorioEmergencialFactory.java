package factory;

import models.Relatorio;
import models.RelatorioEmergencial;

public class RelatorioEmergencialFactory extends RelatorioFactory {

    @Override
    public Relatorio criarRelatorio() {
       return new RelatorioEmergencial();
    }
}
