package factory.exemplo01.singleton;

import factory.exemplo01.modelo.Carro;
import factory.exemplo01.observer.ObservadorRevisao;

import java.util.ArrayList;
import java.util.List;

public class PainelVeiculosProntos implements ObservadorRevisao {

    private final List<String> veiculosProntos = new ArrayList<>();

    @Override
    public void revisaoConcluida(Carro carro) {
        if(!veiculosProntos.contains(carro.getPlaca())){
            veiculosProntos.add(carro.getPlaca());
        }

        System.out.println("[Painel] Veículo " + carro.getPlaca() + "incluído na lista");
    }

    public void exibirPainel(){
        System.out.println("[Painel] Veículos prontos: " + veiculosProntos);
    }

    public List<String> getVeiculosProntos(){
        return new ArrayList<>(veiculosProntos);
    }
}
