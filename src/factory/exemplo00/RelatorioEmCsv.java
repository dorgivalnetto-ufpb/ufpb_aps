package factory.exemplo00;

public class RelatorioEmCsv implements Documento{


    @Override
    public void gerarRelatorio() {
        System.out.println("Gerando o relatório em CSV...");
    }
}
