package models;

public class RelatorioDiario implements Relatorio{
    @Override
    public void enviar(String conteudo) {
        System.out.println("Relatorio diario" + conteudo);
    }
}
