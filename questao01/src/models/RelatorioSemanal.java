package models;

public class RelatorioSemanal implements Relatorio {
    @Override
    public void enviar(String conteudo) {
        System.out.println("Relatorio semanal" + conteudo);
    }
}
