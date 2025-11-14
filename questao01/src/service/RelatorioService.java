package service;
import factory.RelatorioFactory;
import models.Relatorio;

public class RelatorioService {
    public void enviarRelatorio(RelatorioFactory factory, String conteudo) {
        Relatorio relatorio = factory.criarRelatorio();
        relatorio.enviar(conteudo);
    }
}
