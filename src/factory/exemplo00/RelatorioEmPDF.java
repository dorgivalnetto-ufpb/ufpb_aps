package factory.exemplo00;

public class RelatorioEmPDF implements Documento{

    @Override
    public void gerarRelatorio() {
        System.out.println("Gerando o relatório em PDF...");
    }
}
