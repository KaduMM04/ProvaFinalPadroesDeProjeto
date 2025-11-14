import factory.RelatorioDiarioFactory;
import factory.RelatorioEmergencialFactory;
import factory.RelatorioSemanalFactory;
import service.RelatorioService;

public class App {
    public static void main(String[] args) throws Exception {
        RelatorioService service = new RelatorioService();

        service.enviarRelatorio(new RelatorioDiarioFactory(), " Metas diarias ok");

        service.enviarRelatorio(new RelatorioSemanalFactory(), " Metas semanais ok");

        service.enviarRelatorio(new RelatorioEmergencialFactory(), " Metas a serem priorizadas com urgencia");
    }
}
