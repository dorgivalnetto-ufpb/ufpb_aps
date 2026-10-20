package nullobject.exemplo01;

//Carros que tem injeção eletrônica
public class InjecaoeletronicaReal extends InjecaoEletronica{

    @Override
    public void ligar() {
        System.out.println("Injeção eletrônica esá ligada");
    }
}
