package factory.exemplo00;

public class GerenciarRelatorio {

    public void gerarRelatorio(String tipo){
        if(tipo.equals("PDF")){
            RelatorioEmPDF pdf = new RelatorioEmPDF();
            pdf.gerarRelatorio();
        } else if(tipo.equals("EXCEL")){
            RelatorioEmExcel excel = new RelatorioEmExcel();
            excel.gerarRelatorio();
        } else if(tipo.equals("CSV")){
            RelatorioEmCsv csv = new RelatorioEmCsv();
            //csv.gerar();
        }
    }
}
