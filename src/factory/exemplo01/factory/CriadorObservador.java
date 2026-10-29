package factory.exemplo01.factory;

import factory.exemplo01.observer.ObservadorRevisao;
import factory.exemplo01.servico.Oficina;

public abstract class CriadorObservador {

    public abstract ObservadorRevisao criarObservador();

    public void cadastrarNaOficina(Oficina oficina){
        oficina.cadastrarObservador(criarObservador());
    }
}
