package factory.exemplo00;

//Criador concreto
public class CriadorPDF extends CriadorDocumento{

    @Override
    public Documento criar() {
        return new RelatorioEmPDF();
    }
}
