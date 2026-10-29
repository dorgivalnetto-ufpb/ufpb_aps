package factory.exemplo01.strategy;

import factory.exemplo01.modelo.Carro;

public class RevisaoCompleta implements EstrategiaRevisao{
    @Override
    public double calcularValor(Carro carro) {
        return 350.00;
    }

    @Override
    public String getDescricao() {
        return "Completa";
    }
}
