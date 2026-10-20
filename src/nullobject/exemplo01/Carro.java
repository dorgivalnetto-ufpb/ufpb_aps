package nullobject.exemplo01;

public class Carro {

    private String modelo;
    private InjecaoEletronica injecao;

    public Carro(String modelo, InjecaoEletronica injecao){
        this.modelo = modelo;
        //this.injecao = injecao;
        if(injecao == null){
            this.injecao = new InjecaoEletronicaNull();
        }else{
            this.injecao = injecao;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public InjecaoEletronica getInjecao() {
        return injecao;
    }
}
