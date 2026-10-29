package factory.exemplo01.servico;

import factory.exemplo01.modelo.Carro;
import factory.exemplo01.observer.ObservadorRevisao;
import factory.exemplo01.strategy.EstrategiaRevisao;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

    private EstrategiaRevisao estrategiaRevisao;
    private final List<ObservadorRevisao> observadores = new ArrayList<>();

    public void cadastrarObservador(ObservadorRevisao observador){
        if(observador == null){
            throw new IllegalArgumentException("O observador não pode ser nulo");
        }

        if(!observadores.contains(observador)){
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorRevisao observador){
        observadores.remove(observador);
    }

    public void revisar(Carro carro){
        if(carro == null){
            throw new IllegalArgumentException("O carro não pode ser nulo");
        }

        if(estrategiaRevisao == null){
            throw new IllegalArgumentException("Selecione uma estratégia de revisão");
        }

        double valor = estrategiaRevisao.calcularValor(carro);

        System.out.println("Revisão: " + estrategiaRevisao.getDescricao() + " concluída " + carro.getModelo() + "Valor: %.2f%n " + valor);

        System.out.println("\n [Oficina] Revisão concluída: " + carro.getModelo() + carro.getPlaca());

        notificarObservador(carro);
    }

    public void notificarObservador(Carro carro){
        for(ObservadorRevisao observador : observadores){
            observador.revisaoConcluida(carro);
        }
    }

    public void setEstrategiaRevisao(EstrategiaRevisao estrategiaRevisao){
        this.estrategiaRevisao = estrategiaRevisao;
    }

}
