package factory.exemplo00;

public class Main {

    public static void main(String[] args) {
/*
        GerenciarRelatorio gerenciador = new GerenciarRelatorio();

        gerenciador.gerarRelatorio("PDF");
        gerenciador.gerarRelatorio("EXCEL");

 */
        CriadorDocumento criador = new CriadorPDF();
        criador.processarDocumento();
    }
}
