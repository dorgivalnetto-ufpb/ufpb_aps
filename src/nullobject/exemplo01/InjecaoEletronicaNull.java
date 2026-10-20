package nullobject.exemplo01;
//É o coração desse padrão (NULL OBJECT)
//Carros que não tem injeção eletrônica
public class InjecaoEletronicaNull extends InjecaoEletronica{

    @Override
    public void ligar() {
        System.out.println("Exibição: Null Object recebeu a chamada do ligar()");
    }
}
