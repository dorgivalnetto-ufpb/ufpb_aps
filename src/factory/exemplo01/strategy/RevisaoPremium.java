package factory.exemplo01.strategy;

import factory.exemplo01.modelo.Carro;

public class RevisaoPremium implements EstrategiaRevisao{
    @Override
    public double calcularValor(Carro carro) {
        return 500.00;
    }

    @Override
    public String getDescricao() {
        return "Premium";
    }
}
