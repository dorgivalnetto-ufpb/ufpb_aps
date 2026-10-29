package factory.exemplo00;

public abstract class CriadorDocumento {

    //Metodo fabrica
    public abstract Documento criar();

    public void processarDocumento(){
        Documento documento = criar();
        documento.gerarRelatorio();
    }
}
