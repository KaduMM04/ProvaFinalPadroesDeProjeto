package models;

public class RelatorioEmergencial implements Relatorio {

    @Override
    public void enviar(String conteudo) {
       System.out.println("!!Relatorio emergencial!!" + conteudo);
    }

}
