package factory.exemplo01.singleton;

import factory.exemplo01.modelo.Carro;
import factory.exemplo01.observer.ObservadorRevisao;

import java.util.ArrayList;
import java.util.List;

public class PainelVeiculosProntos implements ObservadorRevisao {

    private final List<String> veiculosProntos = new ArrayList<>();

    private static final PainelVeiculosProntos instancia = new PainelVeiculosProntos();

    //Singleton
    private PainelVeiculosProntos(){
    }

    public static PainelVeiculosProntos getInstancia(){
        return instancia;
    }

    @Override
    public void revisaoConcluida(Carro carro) {
        if(!veiculosProntos.contains(carro.getPlaca())){
            veiculosProntos.add(carro.getPlaca());
        }

        System.out.println("[Painel] Veículo " + carro.getPlaca() + "incluído na lista");
    }

    public void exibirPainel(){
        System.out.println("[Painel] Veículos prontos: " + veiculosProntos.toString());
    }

    public List<String> getVeiculosProntos(){
        return new ArrayList<>(veiculosProntos);
    }
}
