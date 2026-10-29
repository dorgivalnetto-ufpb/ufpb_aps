package factory.exemplo01.observer;

import factory.exemplo01.modelo.Carro;

public class SetorFinanceiro implements ObservadorRevisao{
    @Override
    public void revisaoConcluida(Carro carro) {
        System.out.println("[Financeiro] Liberar cobrança da revisão do veículo " + carro.getPlaca());
    }
}
