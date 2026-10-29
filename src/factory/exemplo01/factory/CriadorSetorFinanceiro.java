package factory.exemplo01.factory;

import factory.exemplo01.observer.ObservadorRevisao;
import factory.exemplo01.observer.SetorFinanceiro;

public class CriadorSetorFinanceiro extends CriadorObservador{
    @Override
    public ObservadorRevisao criarObservador() {
        return new SetorFinanceiro();
    }
}
