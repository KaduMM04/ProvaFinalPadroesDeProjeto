package factory;

import models.Relatorio;
import models.RelatorioSemanal;

public class RelatorioSemanalFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
}
